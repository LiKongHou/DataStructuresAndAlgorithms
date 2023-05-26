package Algorithms.Search;

public class ternarySearch {
    public static void main(String[] args) {
        /*
         * Thuật toán Ternary Search là một thuật toán tìm kiếm chia và chinh phục được
         * sử dụng để tìm một phần tử trong một mảng được sắp xếp. Nó hoạt động bằng
         * cách chia mảng thành ba phần và thu hẹp đệ quy phạm vi tìm kiếm dựa trên so
         * sánh phần tử đích với các giá trị tại hai điểm phân vùng. Dưới đây là các
         * bước để xây dựng thuật toán Ternary Search trong Java:
         * 
         * 1. Xác định một phương thức gọi là ternarySearch lấy mảng được sắp xếp, phần
         * tử đích để tìm kiếm và các chỉ số low và high của phạm vi tìm kiếm làm tham
         * số. Phương thức sẽ trả về chỉ mục của phần tử đích nếu tìm thấy hoặc -1 nếu
         * nó không có trong mảng.
         * 
         * 2. Tính hai điểm phân vùng, mid1 và mid2, chia phạm vi tìm kiếm thành ba phần
         * bằng nhau:
         * 
         * mid1 = low + (high - low) / 3
         * mid2 = high - (high - low) / 3
         * 
         * 3. So sánh phần tử mục tiêu với các phần tử ở mid1 và mid2. Có ba trường hợp
         * có thể xảy ra:
         * 
         * - Nếu phần tử đích bằng phần tử ở mid1 hoặc mid2, hãy trả về chỉ mục của phần
         * tử phù hợp.
         * - Nếu phần tử đích nhỏ hơn phần tử ở mid1, hãy gọi đệ quy ternarySearch trên
         * phân vùng bên trái (từ low đến mid1-1).
         * - Nếu phần tử đích lớn hơn phần tử ở mid2, hãy gọi đệ quy ternarySearch trên
         * phân vùng bên phải (từ mid2 + 1 đến high).
         * - Nếu phần tử đích không ở mid1 cũng không mid2, hãy gọi đệ quy ternarySearch
         * trên phân vùng giữa (từ mid1 + 1 đến mid2-1).
         * 
         * 4. Lặp lại bước 2 và 3 cho đến khi tìm thấy phần tử đích hoặc phạm vi tìm
         * kiếm trống (thấp > cao). Nếu phạm vi tìm kiếm trống, trả về -1 để chỉ ra rằng
         * phần tử không có trong mảng.
         * 
         * Lưu ý rằng mảng phải được sắp xếp theo thứ tự tăng dần để thuật toán Tìm kiếm
         * Ternary hoạt động chính xác.
         */
    }
}
