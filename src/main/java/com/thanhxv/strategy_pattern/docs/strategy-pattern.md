# Strategy pattern
## Cấu trúc của Strategy Pattern
- **Context**: Đây là lớp chính sử dụng các chiến lược. `Context` không triển khai trực tiếp các chiến lược mà thay vào đó ủy thác cho một trong các chiến lược được cung cấp.
- **Strategy** Interface: Đây là một giao diện chung cho tất cả các chiến lược, định nghĩa một phương thức chung mà các lớp con phải triển khai.
- **Concrete** Strategy: Đây là các lớp cụ thể, triển khai các thuật toán khác nhau dựa trên giao diện chiến lược.

## Giải thích chi tiết về các thành phần:
- **Context (ShippingContext)**: Lớp này chịu trách nhiệm sử dụng các chiến lược khác nhau. Nó không biết cụ thể về các chiến lược (giao hàng qua đường bộ, đường biển, đường hàng không), mà chỉ gọi phương thức tính phí từ chiến lược đã được thiết lập. Bằng cách này, bạn có thể thay đổi chiến lược mà không cần thay đổi logic trong `ShippingContext`.
- **Strategy Interface (ShippingStrategy)**: Đây là giao diện chung cho các chiến lược tính phí. Giao diện này định nghĩa một phương thức duy nhất là `calculateShippingCost(weight)`.
- **Concrete Strategies (RoadShippingStrategy, SeaShippingStrategy, AirShippingStrategy)**: Các lớp này triển khai chiến lược cụ thể cho từng phương thức vận chuyển. Mỗi chiến lược có cách tính phí riêng.

## Nhược điểm của Strategy Pattern
- **Tăng số lượng lớp**: Việc tạo nhiều lớp chiến lược khác nhau có thể dẫn đến việc tăng số lượng lớp, khiến hệ thống trở nên phức tạp hơn.
- **Phải lựa chọn chiến lược một cách thủ công**: Context cần phải thiết lập chiến lược, điều này yêu cầu phải biết trước hành vi cần sử dụng.

## Note
- Có thể kết hợp với `Factory Pattern` để không phải lựa chọn chiến lược 1 cách thủ công 






