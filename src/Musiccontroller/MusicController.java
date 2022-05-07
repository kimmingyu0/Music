package Musiccontroller;

import MusicDTO.DTO;
import MusicDTO.MusicDTO;
import Musicservice.MusicService;

public class MusicController implements SubController{
	MusicService service = new MusicService();
	@Override
	public boolean execute(int num, DTO dto) {
		//다운캐스팅
		MusicDTO mdto=(MusicDTO)dto;	
		
		//조회 1.삽입 2.수정 3.삭제 4.
		
		if(num==1) {
			
		}else if(num==2) {
			return service.Insert(mdto);
		}else if(num==3) {
			
		}else if(num==4) {
			
		}
		
		
		
		return false;
	}

}
