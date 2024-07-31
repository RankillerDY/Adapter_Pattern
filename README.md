# Adapter Design Pattern

## Mô tả

Dự án này minh họa việc áp dụng Adapter Design Pattern trong Java. Adapter Pattern là một trong những Structural Design Patterns, giúp hai interface không tương thích có thể làm việc cùng nhau. Đây là một trong những pattern quan trọng trong thiết kế phần mềm, giúp tăng tính linh hoạt và khả năng tái sử dụng mã nguồn.

### Adapter Design Pattern

Adapter Pattern được sử dụng khi bạn muốn một lớp có thể tương tác với một lớp khác mà interface của chúng không tương thích. Adapter sẽ đóng vai trò là một lớp trung gian chuyển đổi interface của một lớp này sang interface mà lớp kia có thể hiểu được.

#### Đặc điểm chính của Adapter Design Pattern:
- **Tương thích interface**: Giúp hai lớp không tương thích có thể làm việc cùng nhau bằng cách chuyển đổi interface này sang interface khác.
- **Tăng tính linh hoạt**: Giúp mã nguồn dễ dàng mở rộng và tái sử dụng.

#### Lợi ích của Adapter Design Pattern:
- **Khả năng tái sử dụng**: Cho phép sử dụng lại các lớp hiện có ngay cả khi interface của chúng không tương thích.
- **Tăng tính mở rộng**: Dễ dàng mở rộng hệ thống mà không cần thay đổi mã nguồn hiện có.

## Cài đặt và sử dụng

### Yêu cầu hệ thống

- Java Development Kit (JDK) 8 trở lên.

### Hướng dẫn cài đặt

1. **Clone repository:**
   ```bash
   git clone https://github.com/RankillerDY/adapter-design-pattern.git
   cd adapter-design-pattern
   ```

2. **Biên dịch các file mã nguồn:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Chạy chương trình:**
   ```bash
   java -cp bin Client
   ```

## Cấu trúc dự án

```plaintext
adapter-design-pattern/
├── Adaptee/
│   └── Developer.java
├── Adapter/
│   └── DeveloperAdapter.java
├── Target/
│   └── Customer.java
├── Client.java
└── README.md
```

## Giới thiệu về các thành phần

### Adaptee
`Developer.java` là lớp Adaptee chứa phương thức `receiveMessage(String message)`, phương thức này cần được gọi bởi lớp khác không tương thích về interface.

### Adapter
`DeveloperAdapter.java` là lớp Adapter thực hiện việc chuyển đổi interface của `Developer` để nó có thể tương thích với interface của `Customer`.

### Target
`Customer.java` là interface Target chứa phương thức `sendMessage(String message)`, được `DeveloperAdapter` cài đặt để gọi phương thức `receiveMessage(String message)` của `Developer`.

### Client
`Client.java` là lớp Client sử dụng interface `Customer` để tương tác với lớp `Developer` thông qua lớp `DeveloperAdapter`.
