# Factory Design pattern
- **Factory Pattern** là một mẫu thiết kế thuộc nhóm **Creational Design Patterns**. Nó được sử dụng để tạo ra các đối tượng mà không cần chỉ rõ lớp chính xác của đối tượng đó. Thay vào đó, **Factory Pattern** cung cấp một interface hoặc lớp trừu tượng để cho phép các lớp con quyết định việc khởi tạo đối tượng. Điều này giúp việc tạo các đối tượng linh hoạt và dễ mở rộng hơn.

##  Mục đích của Factory Pattern
- Factory Pattern được sử dụng khi bạn muốn tách rời logic khởi tạo đối tượng khỏi logic xử lý của hệ thống. Nó cho phép thay đổi, mở rộng cách thức khởi tạo đối tượng mà không cần phải chỉnh sửa mã nguồn của phần còn lại của chương trình.

## Khi nào sử dụng Factory Pattern?
- Factory Pattern phù hợp khi:
  - Cần tạo nhiều đối tượng liên quan hoặc có các phương thức khởi tạo phức tạp.
  - Việc khởi tạo đối tượng yêu cầu nhiều bước hoặc phụ thuộc vào điều kiện cụ thể.
  - Muốn các lớp khác trong hệ thống không phụ thuộc vào các lớp cụ thể mà vẫn có thể khởi tạo đối tượng cần thiết.

## Cách hoạt động của Factory Pattern
### Cấu trúc của Factory Pattern:
- **Product Interface**: Đây là một interface hoặc lớp trừu tượng, định nghĩa các phương thức chung mà tất cả các loại sản phẩm phải triển khai.
- **Concrete Products**: Đây là các lớp cụ thể, triển khai interface hoặc lớp trừu tượng của sản phẩm
- **Factory**: Lớp hoặc phương thức chịu trách nhiệm tạo các đối tượng. Factory sẽ quyết định lớp nào sẽ được khởi tạo dựa trên các điều kiện hoặc tham số đầu vào.

## Ưu điểm của Factory Pattern
- **Tăng tính linh hoạt**: Việc sử dụng Factory Pattern giúp mã nguồn dễ mở rộng, bởi vì nếu có thêm loại shipping mới, bạn chỉ cần thêm một lớp cụ thể mà không cần thay đổi phần mã nguồn đã có.
- **Tách biệt quá trình khởi tạo đối tượng**: Các đối tượng được khởi tạo thông qua Factory, do đó các lớp khác không cần biết cụ thể cách khởi tạo đối tượng. Điều này giảm sự phụ thuộc giữa các lớp.
- **Giảm độ phức tạp**: Factory Pattern giúp giảm độ phức tạp của mã nguồn bằng cách ẩn đi chi tiết khởi tạo của các đối tượng cụ thể. Người dùng chỉ cần biết cách sử dụng Factory để tạo đối tượng.

## Nhược điểm của Factory Pattern
- **Tăng số lượng lớp**: Để triển khai Factory Pattern, bạn phải tạo thêm nhiều lớp và interface. Điều này có thể khiến hệ thống trở nên phức tạp và khó quản lý hơn.
- **Không phù hợp cho các hệ thống đơn giản**: Đối với các hệ thống nhỏ, việc sử dụng Factory Pattern có thể không cần thiết và thậm chí làm tăng sự phức tạp không đáng có.

## Sự khác biệt giữa Factory Pattern và các mẫu khác
- **So với Abstract Factory**: **Factory Pattern** tạo ra các đối tượng cụ thể dựa trên một logic đơn giản. Trong khi đó, **Abstract Factory Pattern** là một cấp độ cao hơn, nó tạo ra các nhóm đối tượng liên quan thông qua một giao diện.
- **So với Builder Pattern**: **Builder Pattern** thường được sử dụng khi việc khởi tạo đối tượng phức tạp và yêu cầu nhiều bước, trong khi **Factory Pattern** tạo các đối tượng thông qua một phương thức đơn giản.
- **So với Strategy Pattern**: 
  - **Factory Pattern** tạo ra các đối tượng từ loại đối tượng cần tạo sau đó đối tượng đó có thể execute method để tiếp tục xử lý business 
    - Với **Factory Pattern** loại đối tượng được trả về và tự call method thực thi business  
  - **Strategy Pattern** tạo ra đối tượng `context` từ `instance` của loại hành vi (class implement interface). `context` cung cấp 1 method trong đó loại hành vi execute method xử lý business
    - Với **Strategy Pattern** đối tượng thực thi business method là `context`

## Tình huống sử dụng thực tế
- Hệ thống tài chính: Khi cần khởi tạo các loại tài khoản hoặc giao dịch khác nhau (tài khoản vãng lai, tiết kiệm, đầu tư).
- Hệ thống game: Khi cần tạo các loại nhân vật hoặc vũ khí khác nhau dựa trên một logic đơn giản.
- Hệ thống phần mềm quản lý: Khi cần tạo ra các đối tượng quản lý tài nguyên khác nhau, ví dụ như quản lý tài liệu hoặc người dùng.

