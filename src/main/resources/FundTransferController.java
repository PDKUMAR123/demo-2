import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
@RestController
public class FundTransferController {
	@Autowired
	RestTemplate resttemplate;
	@GetMapping(path="/transfer")
	public String fundtransfering(@RequestParam String accId,@RequestParam String Intiatoracc) {
		boolean status=resttemplate.getForObject("http://localhost:9990/account/microdetails?accId="+Intiatoracc, Boolean.class);
		if(status) {
			return "Success";
		}else {
			return "failed";
		}
	}
}