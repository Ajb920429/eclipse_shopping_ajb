package shopping;

import java.util.List;
import java.util.Scanner;

import day14_20211022_03.BankDTO;

public class productService {
	Scanner scan = new Scanner(System.in);

	// 상품등록
	public List<productDTO> pdLegister(List<productDTO> productList) {

		System.out.print("상품번호 : ");
		String pdNumber = scan.nextLine();
		System.out.print("상품종류 : ");
		String pdType = scan.nextLine();
		System.out.print("상품이름 : ");
		String pdName = scan.nextLine();
		System.out.print("상품가격 : ");
		int pdPrice = scan.nextInt();
		System.out.print("상품재고 : ");
		int pdInventory = scan.nextInt();

		int number = productList.size() + 1;

		productDTO product = new productDTO(number, pdNumber, pdType, pdName, pdPrice, pdInventory);

		productList.add(product);
		return productList;

	}

	// 등록된 상품 조회

	public List<productDTO> pdView(List<productDTO> productList) {
		for (productDTO p : productList) {
			System.out.println(p);
		}
		return productList;

	}

	// 상품 결제

	public List<productDTO> payProduct(List<productDTO> productList) {
		productDTO product = new productDTO();
		product.getPdName();
		product.getPdInventory();
		productList.add(product);
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("결제상품: " ); // 결제 상품이 상품이름이랑 같아야됨
		String payProduct = scan.nextLine();
		int payCount = 0;
		if(payProduct == product.getPdName()) {
			System.out.print("상품을 결정했습니다. " );
			System.out.print("결제개수: ");// 결제 개수가 상품개수보다 크면 안됨
			int payCount1 = scan.nextInt();
		}else if(payCount < product.getPdInventory()){
			System.out.print("결제개수: ");// 결제 개수가 상품개수보다 크면 안됨
			int payCount1 = scan.nextInt();
			System.out.println("결제개수는 " + payCount1 + "개 입니다. " );
			Scanner scan1 = new Scanner(System.in);
			System.out.print("배송지 : ");
			String payAddress = scan1.nextLine();
			System.out.print("연락처 : ");
			String payPhone = scan1.nextLine();
			System.out.print("결제가 완료되었습니다.");
			
		}else {
			System.out.print("결제개수를 초과했습니다. " );
		}
		
		return productList;
		

	}
	
	
	
	

}
