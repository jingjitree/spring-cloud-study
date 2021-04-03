package top.inson.springcloud.core;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName TokenCheckFilter
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 20:18
 * @Version 1.0
 **/
@Slf4j
@Component
public class TokenCheckFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //过滤器的类型：pre路由之前，routing：路由之时，post路由之后，error发送错误调用
        return "pre";
    }

    //过滤的顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否要过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("进入到zuul拦截器了");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("请求的方法：{},请求地址：{}", request.getMethod(), request.getRequestURL());
        String token = request.getHeader("token");
        log.info("请求的token：" + token);
        if(StringUtils.isEmpty(token)){
            log.info("token为空");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            PrintWriter writer = null;
            try {
                HttpServletResponse response = context.getResponse();
                response.setCharacterEncoding("UTF-8");
                writer = response.getWriter();
                writer.write("token不能为空");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null)
                    writer.close();
            }
        }
        return null;
    }
}
