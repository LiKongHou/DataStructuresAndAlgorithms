package Algorithms.Search;

public class exponentialSearch {
    public static void main(String[] args) {
        /*
         * Thuật toán Tìm kiếm theo cấp số nhân là một thuật toán tìm kiếm hoạt động
         * trên các mảng được sắp xếp. Nó bắt đầu bằng cách tìm một phạm vi trong đó
         * phần tử đích có thể tồn tại và sau đó thực hiện tìm kiếm nhị phân trong phạm
         * vi đó để tìm phần tử đích. Dưới đây là các bước để xây dựng thuật toán
         * Exponential Search trong Java:
         *
         * 1.Bắt đầu bằng cách định nghĩa một phương thức gọi là exponentialSearch có hai
         * tham số: mảng được sắp xếp sẽ được tìm kiếm và phần tử đích được tìm thấy.
         * Phương thức sẽ trả về chỉ mục của phần tử đích nếu tìm thấy hoặc -1 nếu không
         * tìm thấy.
         *
         * 2.Kiểm tra xem phần tử đầu tiên của mảng có bằng với phần tử đích hay không.
         * Nếu có, trả về 0 khi phần tử đích được tìm thấy ở chỉ mục đầu tiên.
         *
         * 3.Xác định phạm vi cho tìm kiếm nhị phân. Bắt đầu với một biến gọi là bound set
         * thành 1, và trong khi bound nhỏ hơn độ dài của mảng và phần tử ở bound nhỏ
         * hơn phần tử đích, hãy nhân bound với 2.
         *
         * 4.Đặt chỉ mục bắt đầu cho tìm kiếm nhị phân đến mức tối thiểu của ràng buộc và
         * độ dài của mảng.
         *
         * 5.Đặt chỉ mục kết thúc cho tìm kiếm nhị phân đến mức tối thiểu của ràng buộc và
         * độ dài của mảng trừ đi 1.
         *
         * 6.Thực hiện tìm kiếm nhị phân trong phạm vi xác định. Mặc dù chỉ số bắt đầu nhỏ
         * hơn hoặc bằng chỉ số kết thúc, hãy tính chỉ số giữa làm trung bình của chỉ số
         * bắt đầu và kết thúc. So sánh yếu tố ở chỉ số giữa với phần tử mục tiêu và
         * điều chỉnh các chỉ số bắt đầu và kết thúc cho phù hợp.
         *
         * 7.Nếu phần tử đích được tìm thấy trong quá trình tìm kiếm nhị phân, hãy trả về
         * chỉ mục.
         *
         * 8.Nếu không tìm thấy phần tử đích, hãy trả về -1 để chỉ ra rằng nó không có
         * trong mảng.
         */


    }
}
