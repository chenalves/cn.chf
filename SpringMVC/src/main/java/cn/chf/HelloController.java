package cn.chf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	     //ModelAndView��װ����ͼ���ֺʹ���ȥ������
		@RequestMapping("/hello.do")
		public ModelAndView execute() throws Exception {
			// TODO ����ģ���������
			ModelAndView mav = new ModelAndView();
			mav.setViewName("hello");//��hello��ͼ
			mav.getModel().put("data", "HelloWorld");//�������ݣ����Դ��ݵ�jsp
			return mav;
		}
}
