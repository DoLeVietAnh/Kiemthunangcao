Đỗ Lê Việt Anh - BIT220014 - 22SE1

# Binary Tree Search Algorithm
## Giới thiệu
Dự án này triển khai thuật toán tìm kiếm giá trị trong cây nhị phân và sử dụng JUnit để kiểm thử.
Nó bao gồm các cấu trúc dữ liệu cơ bản, các trường hợp kiểm thử nâng cao, và được tổ chức theo cấu trúc dự án chuẩn.

## Chức năng
- Tìm kiếm giá trị trong cây nhị phân
- Hỗ trợ các tình huống đặc biệt như:
    - Cây rỗng.
    - Cây chỉ có một nút.
    - Cây không cân bằng.
    - Cây có giá trị trùng lặp.
    - Cây chứa giá trị âm.

## Cấu trúc dự án

    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │      └── TreeNode.java         # Lớp định nghĩa cây nhị phân
    │   │   │      └── BinaryTreeUtils.java  # Lớp chứa thuật toán tìm kiếm
    │   ├── test/
    │   │   ├── java/
    │   │          └── BinaryTreeUtilsTest.java  # Các trường hợp kiểm thử JUnit
    ├── README.md                              # Tệp tài liệu dự án
    └── pom.xml                                # Tệp cấu hình Maven

## Hướng dẫn sử dụng
### 1. Cài đặt
- Yêu cầu: 
    - Java 11 hoặc mới hơn.
    - Maven hoặc Gradle để quản lý dự án.
- Clone dự án:
``` 
git clone https://github.com/DoLeVietAnh/Kiemthunangcao
cd Kiemthunangcao
```
- Build dự án
```
mvn clean install
```

### 2. Chạy kiểm thử
Sử dụng JUnit để chạy các trường hợp kiểm thử:
- Chạy kiểm thử:
```
mvn test
```

- Kiểm tra kết quả: Báo cáo kiểm thử sẽ được xuất ra màn hình hoặc thư mục ```target/surefire-reports```

## Giải thích các lớp trong dự án
### Lớp ```TreeNode```
- Vị trí: ```main/java/TreeNode```
- Chức năng:
Lớp này định nghĩa cấu trúc của một nút trong cây nhị phân. Mỗi nút có:
- Giá trị (```value```): Giá trị lưu trữ tại nút.
- Con trái (```left```): Tham chiếu đến con bên trái.
- Con phải (```right```): Tham chiếu đến con bên phải.
Mã nguồn: 
```java
package com.example.model;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
```

### Lớp ```BinaryTreeUtils```
- Vị trí: ```main/java/BinaryTreeUtils```
- Chức năng: Cung cấp các phương thức tiện ích để thao tác với cây nhị phân. Trong trường hợp này, lớp cung cấp thuật toán tìm kiếm giá trị trong cây nhị phân bằng cách sử dụng duyệt cây (DFS)
Mã nguồn: 
```java
package com.example.utils;

import com.example.model.TreeNode;

public class BinaryTreeUtils {
    public static boolean containsValue(TreeNode root, int value) {
        // Nếu cây rỗng
        if (root == null) {
            return false;
        }

        // Kiểm tra giá trị tại nút hiện tại
        if (root.value == value) {
            return true;
        }

        // Duyệt cây con bên trái và bên phải
        return containsValue(root.left, value) || containsValue(root.right, value);
    }
}
```
#### Chi tiết: 
- Nếu cây rỗng (```root = null```): trả về ```false```
- So sánh giá trị cần tìm với giá trị nút hiện tại:
    - Nếu trùng, trả về ```true```.
    - Nếu không, tiếp tục duyệt cây con bên trái và bên phải.

### Lớp ```BinaryTreeUtilsTest```
- Vị trí: ```test/java/BinaryTreeUtilsTest```
- Chức năng: Chứa các kiểm thử sử dụng JUnit để đảm bảo thuật toán hoạt động đúng với các tình huống khác nhau.

## Kết quả kiểm thử
Khi chạy ```JUnit``` kết quả trả được về:![image](https://github.com/user-attachments/assets/3499dfd8-4ceb-47de-9fd4-1f9fa4e55152)
