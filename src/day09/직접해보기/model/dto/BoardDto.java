package day09.직접해보기.model.dto;

public class BoardDto {
    // DTO: 데이터 이동객체??, 자바는 저장소가 아니다. 즉] 데이터베이스(저장소)가 저장소 
    // 1. 데이터베이스 표에서 (CRUD) 사용할 자료들을 private 멤버변수로 구성
    private String phone;
    private int ready;
    // 2. 기본생성자, 전체매개변수생성자
    public BoardDto() { }
    public BoardDto(String phone, int ready) {
        this.phone = phone;
        this.ready = ready;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getReady() {
        return ready;
    }
    public void setReady(int ready) {
        this.ready = ready;
    }
    @Override
    public String toString() {
        return "BoardDto [toString()=" + super.toString() + "]";
    }
    
} // CLASS END 