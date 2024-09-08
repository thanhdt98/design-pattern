# Strategy pattern

## Mục đích của Strategy Pattern
- Mục đích chính của **Strategy Pattern** là cho phép lựa chọn giữa các thuật toán hoặc hành vi khác nhau của một đối tượng mà không cần phải sửa đổi trực tiếp mã nguồn của đối tượng đó. Điều này được thực hiện bằng cách tách phần logic của thuật toán ra thành các lớp riêng biệt, gọi là **strategies** (chiến lược).

## Khi nào sử dụng Strategy Pattern?
- Strategy Pattern hữu ích trong các tình huống:
  - Có nhiều cách xử lý khác nhau và muốn lựa chọn một cách xử lý phù hợp trong từng hoàn cảnh.
  - Muốn tách rời logic thuật toán ra khỏi phần còn lại của chương trình để dễ bảo trì.
  - Các thuật toán hoặc cách xử lý có thể được thay đổi, mở rộng mà không ảnh hưởng đến hệ thống tổng thể.
  - Muốn tránh việc sử dụng các cấu trúc điều kiện lồng nhau (`if-else` hoặc `switch-case`) vì chúng khiến mã nguồn khó đọc và bảo trì.

## Cấu trúc của Strategy Pattern
- **Context**: Đây là lớp chính sử dụng các chiến lược. `Context` không triển khai trực tiếp các chiến lược mà thay vào đó ủy thác cho một trong các chiến lược được cung cấp.
- **Strategy** Interface: Đây là một giao diện chung cho tất cả các chiến lược, định nghĩa một phương thức chung mà các lớp con phải triển khai.
- **Concrete** Strategy: Đây là các lớp cụ thể, triển khai các thuật toán khác nhau dựa trên giao diện chiến lược.

### Giải thích chi tiết về các thành phần:
- **Context (ShippingContext)**: Lớp này chịu trách nhiệm sử dụng các chiến lược khác nhau. Nó không biết cụ thể về các chiến lược (giao hàng qua đường bộ, đường biển, đường hàng không), mà chỉ gọi phương thức tính phí từ chiến lược đã được thiết lập. Bằng cách này, bạn có thể thay đổi chiến lược mà không cần thay đổi logic trong `ShippingContext`.
- **Strategy Interface (ShippingStrategy)**: Đây là giao diện chung cho các chiến lược tính phí. Giao diện này định nghĩa một phương thức duy nhất là `calculateShippingCost(weight)`.
- **Concrete Strategies (RoadShippingStrategy, SeaShippingStrategy, AirShippingStrategy)**: Các lớp này triển khai chiến lược cụ thể cho từng phương thức vận chuyển. Mỗi chiến lược có cách tính phí riêng.

## Ưu điểm của Strategy Pattern
- **Dễ dàng mở rộng**: Khi có thêm thuật toán mới, bạn chỉ cần tạo một lớp chiến lược mới mà không phải sửa đổi mã nguồn của đối tượng sử dụng chiến lược.
- **Giảm thiểu sử dụng các cấu trúc điều kiện**: Strategy Pattern giúp tránh việc sử dụng if-else hoặc switch-case dài dòng để lựa chọn thuật toán.
- **Đơn giản hóa việc bảo trì**: Khi một thuật toán hoặc hành vi thay đổi, bạn chỉ cần cập nhật lớp chiến lược tương ứng mà không ảnh hưởng đến toàn bộ hệ thống.

## Nhược điểm của Strategy Pattern
- **Tăng số lượng lớp**: Việc tạo nhiều lớp chiến lược khác nhau có thể dẫn đến việc tăng số lượng lớp, khiến hệ thống trở nên phức tạp hơn.
- **Phải lựa chọn chiến lược một cách thủ công**: Context cần phải thiết lập chiến lược, điều này yêu cầu phải biết trước hành vi cần sử dụng.

## Note
- Có thể kết hợp với `Factory Pattern` để không phải lựa chọn chiến lược 1 cách thủ công 






