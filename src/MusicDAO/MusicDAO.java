package MusicDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import MusicDTO.MusicDTO;

public class MusicDAO {
   //연결관련 정보 저장용 변수
      String id="root";
      String pw="1234";
      String url="jdbc:mysql://localhost:3306/musicdb";
      
      //DB연결관련 객체를 위한 참조변수
      Connection conn=null;         //DB연결객체(커넥션 객체를 연결할 참조변수 conn)   
      PreparedStatement pstmt=null;   //SQL 쿼리 전송 객체
      ResultSet rs=null;            //쿼리 결과(Select) 수신용 객체
      
      public MusicDAO(){ //MusicDAO 생성자생성
      //연결(예외처리)
      try {
         //DB Driver 로드
         Class.forName("com.mysql.cj.jdbc.Driver");   //java메모리 공간에 "com.mysql.cj.jdbc.Driver"에 있는 Class를 적재
         System.out.println("Driver Loading Success!");
         //DB 연결객체 생성
         conn=DriverManager.getConnection(url,id,pw);
         System.out.println("DB Connected..");
      }catch(Exception e) {      
         e.printStackTrace();
      }

   }
      //(num:1)
      public void Select() {
         
      }
      // (num:2)
      public boolean Insert(MusicDTO dto) {
         try {
            pstmt = conn.prepareStatement("insert into music_tbl values(?,?,?,?,?,?)");
            pstmt.setInt(1, dto.getMusic_Code());
            pstmt.setString(2,dto.getMusic_Title());
            pstmt.setString(3,dto.getMusic_Genre());
            pstmt.setString(4,dto.getMusic_Release());
            pstmt.setString(5,dto.getMusic_Keyword());
            pstmt.setString(6,dto.getMusic_Decase());
           
            
            int result = pstmt.executeUpdate();
            
            if(result!=0) {
               return true;
            }
         } catch (Exception e) {
            e.printStackTrace();
         }finally {
            try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
         }
         
         return false;
      }
      //(num:3)
      public void Update() {
         
      }
      //(num:4)
      public void Delete() {
         
      }
}