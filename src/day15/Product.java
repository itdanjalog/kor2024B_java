package day15;

// 제품 정보의 객체설계도
public class Product {
    // 1. 멤버변수
    private String name; // 제품명
    private int price; // 가격
    private String company; // 제조사
    // 2. 생성자 // 기본생성자,풀생성자
    public Product(){}
    public Product( String name ,int price , String company ) {
        this.price = price;
        this.name = name;
        this.company = company;
    }
    // 3. 메소드 // getter and setter // toString
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
    public String getName() { return name;  }
    public void setName(String name) { this.name = name;}
    public int getPrice() {   return price; }
    public void setPrice(int price) {   this.price = price;}
    public String getCompany() {  return company;  }
    public void setCompany(String company) {this.company = company;}
}
