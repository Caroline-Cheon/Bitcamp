/* 주제: 파일로 로그 출력
 * 1) 로그 출력명 지정
 *    - log4j.rootLogger=DEBUG, logfile
 * 2) 로그 출력 방법을 설정
 *    - log4j.appender.logfile.File==org.apache.log4j.FileAppender
 * 3) 로그 파일명 지정
 *    - log4j.appender.logfile.File=ex4.log
 * 4) 로그 파일의 최대 크기
 *    - log4j.appender.logfile.MaxFileSize=크기KB
 * 5) 로그 파일의 최대 백업 인덱스
 *    - log4j.appender.logfile.MaxBackupIndex=인덱스
 * 6) 출력 형식 지정
 *    - log4j.appender.logfile.layout=출력형식을 다루는 클래스명
 *    
 */

package step31.ex4;

public class Test01 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }
}
