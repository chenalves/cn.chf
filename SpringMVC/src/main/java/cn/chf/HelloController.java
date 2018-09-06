package cn.chf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	     //ModelAndView封装了视图名字和传出去的数据
		@RequestMapping("/hello.do")
		public ModelAndView execute() throws Exception {
			// TODO 调用模型组件处理
			ModelAndView mav = new ModelAndView();
			mav.setViewName("hello");//找hello视图
			mav.getModel().put("data", "HelloWorld");//放入数据，可以传递到jsp
			return mav;
		}
}
