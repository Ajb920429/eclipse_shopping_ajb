package shopping;

import java.util.List;
import java.util.Scanner;

import day14_20211021_01.MemberDTO;

public class LoginService {

	// 회원 가입 : 아이디 생성
	Scanner scan = new Scanner(System.in);

	public List<LoginDTO> idJoin(List<LoginDTO> loginList) {

		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		System.out.print("휴대폰 번호 : ");
		String phoneNumber = scan.nextLine();
		int number = loginList.size() + 1;

		LoginDTO login = new LoginDTO(number, id, password, name, email, phoneNumber);

		loginList.add(login);
		return loginList;

	}

	// 아이디 조회

	public List<LoginDTO> idView(List<LoginDTO> loginList) {
		for (LoginDTO l : loginList) {
			System.out.println(l);
		}
		return loginList;

	}

	// 로그인

	public List<LoginDTO> idLogin(List<LoginDTO> loginList) {

		int result = loginCheck(loginList);

		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(loginList.get(result).getId() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		return loginList;

	}

	// 아이디, 비밀번호 확인을 위한 메서드

	public int loginCheck(List<LoginDTO> loginList) {

		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		int indexNumber = -1;
		for (int i = 0; i < loginList.size(); i++) {
			if (id.equals(loginList.get(i).getId()) && password.equals(loginList.get(i).getPassword())) {
				indexNumber = i;
			}

		}

		return indexNumber;

	}

	// 아이디 변경

	List<LoginDTO> idUpdate(List<LoginDTO> loginList) {

		int result = loginCheck(loginList);
		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(loginList.get(result).getId() + "님 환영합니다.");
			System.out.print("변경할 아이디 : ");
			String id = scan.nextLine();
			System.out.print("변경할 비밀번호 : ");
			String password = scan.nextLine();
			loginList.get(result).setId(id);
			loginList.get(result).setPassword(password);
			
		} else {
			System.out.println("로그인 실패");
		}
		
		return loginList;
	}

}
