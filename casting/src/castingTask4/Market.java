package castingTask4;

public class Market {
   private String name;
   
   public Market() {;}

   public Market(String name) {
      super();
      this.name = name;
   }
   
   String getName() {
	return name;
}

void setName(String name) {
	this.name = name;
}

Product[] getProducts() {
	return products;
}

void setProducts(Product[] products) {
	this.products = products;
}

int getProductCount() {
	return productCount;
}

void setProductCount(int productCount) {
	this.productCount = productCount;
}

public void getSell(Product product, Cunsumor cunsumor) {
      if(cunsumor.getMoney() >= product.getPrice() && product.getProductStock() > 0) {
         if(cunsumor instanceof MarketMember) {
            int discount = (int)(product.getPrice() * 0.7);
            cunsumor.setMoney(cunsumor.getMoney() - discount);
            System.out.println("지불할 가격은 " + discount + "원 이며, 현재 남은 잔액은 " + cunsumor.getMoney() +"원 입니다.");
            product.setProductStock(product.getProductStock() - 1);
            System.out.println("남은 재고 : " + (product.getProductStock()));
         } else if(cunsumor instanceof MarketNonMember) {
            //쿠폰 10장 있을 때
            if(cunsumor.getCoupon() >= 10) {
            	cunsumor.setCoupon(cunsumor.getCoupon() - 10);
               System.out.println("쿠폰 10장을 사용하셨습니다. 남은 잔액 : " + cunsumor.getMoney() + " 남은 쿠폰 수 : " + cunsumor.getCoupon());
            }else {
               //비회원 + 쿠폰없음
               int discount = (int)(product.getPrice() * 0.95);
               cunsumor.setMoney(cunsumor.getMoney() - discount);
               System.out.println("지불할 가격은 " + discount + "원 이며, 현재 남은 잔액은 " + cunsumor.getMoney() + "원 입니다.");
               cunsumor.setCoupon(cunsumor.getCoupon() + 1);
               System.out.println("쿠폰이 발급되었습니다! 남은 쿠폰 수 : " + cunsumor.getCoupon());
               product.setProductStock(product.getProductStock() - 1);
               System.out.println("남은 재고 : " + product.getProductStock());
            }
         }
      } else if(cunsumor.getMoney() >= product.getPrice() && product.getProductStock() <= 0) {
         System.out.println("상품이 존재하지 않거나 잔액이 부족합니다.");
      } else {
         System.out.println("안살거면 안녕히가세요");
      }
   }
   

   Product[] products = new Product[5]; 
   //등록한 상품
   int productCount = 0; 
   
   public void getRegisterProduct(Product product) {
      //등록된 상품 확인하고
      //이름의 중복 체크하기 
      for(int i = 0; i < productCount; i++) {
         if(products[i].getName().equals(product.getName())) {
            System.out.println("이미 등록된 상품이 존재합니다." + product.getName());
            return;
         }
      }
      
      //최대 5개까지 등록
      if(productCount >= products.length) {
         System.out.println("상품 등록 개수를 초과하였습니다 최대 5개 : " + product.getName());
         return;
      } 
      
      //5개 제한
      if(product.getProductStock() > 5) {
         product.setProductStock(5);
         System.out.println("재고는 최대 5개까지만 가능합니다.");
      }
      
      //등록
      products[productCount++] = product;
      System.out.println("상품이 등록되었습니다 : " + product.getName() + " / 가격 : " + product.getPrice() + "원 / 재고 : " + product.getProductStock() + "개");
      
   }
   
   //포인트 적립
   public void getPoint(Product product, Cunsumor cunsumor) {
      //회원인 경우
      if(cunsumor instanceof MarketMember) {
         //적립
         int plus = (int)(product.getPrice() * 0.1);
         cunsumor.setPoint(plus);
         System.out.println("적립 포인트 : " + cunsumor.getPoint() + "p");
         //비회원인 경우
      } else if(cunsumor instanceof MarketNonMember) {
         //적립
         int plus = (int)(product.getPrice() * 0.05);
         cunsumor.setPoint(plus);
         System.out.println("적립 포인트 : " + cunsumor.getPoint() + "p");
      }
   }
   
}
