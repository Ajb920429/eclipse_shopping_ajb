package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import day14_20211021_01.MemberDTO;

public class shoppingMall {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<LoginDTO> loginList = new ArrayList<LoginDTO>();
		List<productDTO> productList = new ArrayList<productDTO>();

		productService pr = new productService();
		LoginService lo = new LoginService();

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.아이디 변경 | 5.상품등록 | 6.상품조희 |7.상품결제 | 8.종료");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 1) {
				// 회원가입
				loginList = lo.idJoin(loginList);
			} else if (select == 2) {
				// 전체회원조회
				loginList = lo.idView(loginList);
			} else if (select == 3) {
				// 로그인
				loginList = lo.idLogin(loginList);
			} else if (select == 4) {
				// 아이디 변경
				loginList = lo.idUpdate(loginList);
			} else if (select == 5) {
				// 상품등록
				productList = pr.pdLegister(productList);
			} else if (select == 6) {
				// 상품조회
				productList = pr.pdView(productList);
			} else if (select == 7) {
				// 상품결제
				productList = pr.payProduct(productList);
			} else if (select == 8) {
				System.out.println("종료합니다.");
				run = false;

			} else {

				System.out.println("다시 선택해주세요.");
			}

		}

	}

}
