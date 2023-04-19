#### Kiến trúc MVC trong Spring Boot được xây dựng dựa trên tư tưởng "độc lập" kết hợp với các nguyên lý thiết kế hướng đối tượng (một đại diện tiêu biểu là Dependency Inversion). Độc lập ở đây ám chỉ việc các layer phục vụ các mục đích nhất định, khi muốn thực hiện một công việc ngoài phạm vi thì sẽ đưa công việc xuống các layer thấp hơn.

#####   Kiến trúc Controller-Service - Repository chia project thành 3 lớp:

1. Consumer Layer hay Controller: là tầng giao tiếp với bên ngoài và handler các request từ bên ngoài tới hệ thống.

2. Service Layer: Thực hiện các nghiệp vụ và xử lý logic

3. Repository Layer: Chịu trách nhiệm giao tiếp với các DB, thiết bị lưu trữ, xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu.


* `@Service Đánh dấu một Class là tầng Service, phục vụ các logic nghiệp vụ.`
* `@Repository Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.`

``Về bản chất @Service và @Repository cũng chính là @Component. Nhưng đặt tên khác nhau để giúp chúng ta phân biệt các tầng với nhau.``

### Tuy nhiên từ góc độ thiết kế thì chúng ta cần phân rõ 3 Annotation này cho các Class đảm nhiệm đúng nhiệm vụ của nó.

* @Service gắn cho các Bean đảm nhiệm xử lý logic
* @Repository gắn cho các Bean đảm nhiệm giao tiếp với DB
* @Component gắn cho các Bean khác.

### Đây là 2 cách để tìm bean ở các package khác vì Component chỉ dò các class cùng cấp hoặc thấp hơn

* @ComponentScan Tìm các Bean bên cạnh class App và những package con bên cạnh app
* @SpringBootApplication(scanBasePackages="") Tìm các Bean bên cạnh class App và những package con bên cạnh app