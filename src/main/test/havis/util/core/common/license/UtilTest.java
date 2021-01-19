package havis.util.core.common.license;

import org.junit.Test;

public class UtilTest {

	@Test
	public void licenseTest() throws Exception {
		System.setProperty("mica.device.serial_no", "4711");
		String data = "eyJsaWNlbnNlZSI6ICJIQVJUSU5HIiwgInByb2R1Y3QiOiAiTWlkZGxld2FyZSIsICJzZXJpYWwiOiAiNDcxMSJ9ALv94tZN9iI8X+dythIledQ+nrSx0mxilws+R4tmJLHGHyrkyx+NjUgUfKiBuQegtoJ3NsCT+ACw6s59BQcehOrfB6zFObw7/sR87lXNmr9BJzD0xD9sRMcv2FSzBgPaXJTe5/M8iVj19KcWiorzyP7wq2hYnBSe79NoqOo8hBgdRBbcfeh2PJdYxwoFmDTA04F6Eb5m82GpiJAStm0NJffnX+MKPQh7tU5j+LGNfYsnENikzF9ChrhBmTWpLJdw/UPQGiX43VkYMzWqw1Z2cwlXLCzbSppz3b5bqimo10+ewnM6WEssn4UmGpRAemBbnSEKuOPyrU/XgeMUn2F1tw7IbxBWcwHbUAI2ealpxQhxkUNivC6LbEWBcWUv8daguLSmEJemq3g3c9KRFZtXuXdErkGwRrEkHNSXINX70FVUPGc21oAkuUtw8gBm4cRUTKl1CBQADqCmln948qLImcbSGyS/NbyRGueiXzom14A0TeQxqMVudQPQelhKk7NRTkGMf9v+aqHMsxlhVqB7K6OSiFBlsyQWxtST3WAKO+go96FnwgaDd7xlgBmspPia3mKVJ1Qrd/ewGgsZ5kZfOwSbWiHNZC/EOia9DeAxKYGqJS/awA8M2IgGxiaXITSWoQfVUAbBiuCTvFt15XXLZVW+h04M3VdcZq69VH7Z3C4H";
		Util.get("Middleware", data);
	}
}