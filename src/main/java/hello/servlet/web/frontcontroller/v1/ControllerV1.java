package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

public interface ControllerV1 {
    void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException;
}
