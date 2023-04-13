
`@Component là một Annotation (chú thích) đánh dấu trên các Class để giúp Spring biết nó là một Bean `

`@Autowired: Là Annotation được chú thích trên một thuộc tính (field) hoặc hàm (function) để nói với IoC Container là hãy tự inject những thuộc tính này`

`@Qualifier xác định tên của một Bean mà bạn muốn chỉ định inject.`

`@Primary là annotation đánh dấu trên một Bean, giúp nó luôn được ưu tiên lựa chọn trong trường hợp có nhiều Bean cùng loại trong Context.`

`@Scope("prototype"): tương đương với việc tạo new Object`

`@Scope("singleton"): Không nói gì, thì Spring sẽ mặc định là scope này. Singleton, đối tượng chỉ được tạo ra duy nhất một lần.`

`@Configuration: Là một Annotation đặc biệt của Spring. Khi một class được đánh dấu là @Configuration thì Spring hiểu class này là nơi chúng ta cấu hình, cài đặt và tạo ra những Bean cần thiết cho chương trình, nên IOC Container nó sẽ chạy vào Class này trước tiên.`

`@Bean: Chỉ được gắn trên method và nó sẽ đánh dấu đối tượng trả về trong hàm là bean và IoC Container sẽ phải quản lý nó. Tương tự @Component. tuy nhiên @Bean chỉ gắn trên method mà thôi.`