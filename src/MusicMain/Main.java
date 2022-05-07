package MusicMain;

import MusicDAO.MusicDAO;
import MusicDTO.MusicDTO;
import MusicView.Viewer;
import Musiccontroller.FrontController;

public class Main {

	public static void main(String[] args) {
		
		//1 MusicDAO-MusicDTO 테스트
//		MusicDTO dto = new MusicDTO(2,"sad","asd","asdd","dq","sad");
//		MusicDAO dao = new MusicDAO();
//		
//		dao.Insert(dto);

//		FrontController controller = new FrontController();
//		MusicDTO dto = new MusicDTO(2,"휘파람","발라드","1980년","감성","이문세");
//		controller.SubControllerEX("Music", 2, dto);//서비스명, 작업번호, 전달단위
		
		Viewer view1 = new Viewer();
		view1.MusicMenu();
	}

}
