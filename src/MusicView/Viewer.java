package MusicView;

import java.util.Scanner;

import MusicDTO.MusicDTO;
import Musiccontroller.FrontController;

public class Viewer {

	int num;
	Scanner sc = new Scanner(System.in);
	
	//컨트롤러객체를 추가
	FrontController controller = new FrontController();
	
	
	//메인메뉴
	public void MainMenu() {
		while(true)
		{
		System.out.println("-------------LOGIN--------------");
		System.out.println("1 직원로그인");
		System.out.println("2 회원로그인");
		System.out.println("3 종료");
		System.out.println("-------------LOGIN--------------");
		System.out.println("번호 : ");
		num=sc.nextInt();
		switch(num)
		{
			case 1: //직원로그인
				MusicMenu();
				break;
			case 2: //회원로그인
				break;
			case 3: //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(-1);
				break;
			default : 
				System.out.println("잘못 입력하였습니다...");
		
		}//switch 끝
		
		}//while 끝
	}
	//도서메뉴
	public void MusicMenu() {
		while(true)
		{
			System.out.println("---------------BOOK-------------");
			System.out.println("1 Select");
			System.out.println("2 Insert");
			System.out.println("3 Update");
			System.out.println("4 Delete");
			System.out.println("5 Prev");
			System.out.println("---------------BOOK-------------");
			num = sc.nextInt();
			switch(num)
			{
			case 1: //조회
				System.out.println("책조회요청!");
				break;
			case 2: //삽입
				System.out.println("음악코드|제목|장르|발매년도|키워드|몇년대음악 > ");
				int Code = sc.nextInt();
				String Title = sc.next();
				String Genre = sc.next();
				String Release = sc.next();
				String Keyword = sc.next();
				String Decase = sc.next();
				MusicDTO dto = new MusicDTO(Code,Title,Genre,Release,Keyword,Decase);
										//코드, 책제목, 저자, 출판사, 대여가능여부
				
				boolean result = controller.SubControllerEX("Music", 2, dto);
										// BOOK 컨트롤러 선택, 삽입, 저장책정보
				
				if(result)
					System.out.println("INSERT 성공");
				else
					System.out.println("INSERT 실패");
				
				
				break;
				
			case 3: //수정
				System.out.println("책수정요청!");
				break;
			case 4: //삭제
				System.out.println("책수정삭제!");
				break;
			case 5: //이전으로
				return; //MainMenu로 리턴
			default: //잘못누름
				System.out.println("번호 다시 입력하세요....");
			}
		}
		
	}
}
