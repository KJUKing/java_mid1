package lang.exception.ex3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getAddress() + ", 메세지: " + e.getMessage());

        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage() );
        } finally {
            client.disconnect();
        }

    }
}

