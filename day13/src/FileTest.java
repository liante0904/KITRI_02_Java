import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File dir;
		dir = new File( "c:\\");
		dir = new File( "."); // 현재경로 (day13)
		File[] fileList = dir.listFiles();
		
		Date date = null;
		System.out.println(dir.isDirectory() ); //파일과 디렉토리의 존재 여부

		
		try{
			for(int i = 0 ; i < fileList.length ; i++){
				File file = fileList[i]; 
				if(file.isFile() ){
    // 파일이 있다면 파일 이름 출력
					System.out.println(  file.getName());
				}else if(file.isDirectory()  ){
					file.getCanonicalPath().toString(); 
    // 하위디렉토리가 존재하면 재귀적 방법으로 다시 탐색
				}
				System.out.println( " <DIR>" + file.getName());
			}
		}catch(IOException e){
			
			
		/*		if(dir.isDirectory())
		{
			String[] subname = dir.list();
			for (String name : subname) {
				System.out.println(name);
			 */
		/*	File[] subfile = dir.listFiles();
			for (File file : subfile) {
				System.out.println(file);

				*/
				/*
				for(File f: subfile)
				{
					long lm = f.lastModified();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
					String msg = sdf.format(new Date(lm) );
					
					if(f.isDirectory())
					{
						msg += "     <DIR>   "; 
					}else {
						msg +=" ";
						msg += f.length();
					}
					msg += f.getName();
					System.out.println(msg);
				}*/
				
					
					
				/*
				long name = dir.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
				
				System.out.print(sdf.format(name) );
*/				
				
			}

		}
	}
