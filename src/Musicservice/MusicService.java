package Musicservice;

import MusicDAO.MusicDAO;
import MusicDTO.MusicDTO;
import MusicDTO.DTO;

public class MusicService {
	//멤버
	MusicDAO dao = new MusicDAO();
	
	//조회
	
	//추가
	public boolean Insert(MusicDTO dto) {
		return dao.Insert(dto); //전달받은 dto를 dao로 넘김
								//그리고 반환되는 값을 Controller로 전달(true/false)
	}
	//수정
	
	//삭제
	
}
