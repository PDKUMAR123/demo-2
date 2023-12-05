 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(path="/account")
public class AccountController {
	@Autowired
	private AccountService Accservice;
	public AccountService getAccservice() {
		return Accservice;
	}
	public void setAccservice(AccountService accservice) {
		this.Accservice = accservice;
	}
	@GetMapping(path="/Details")
	public boolean getAccounting(@RequestParam String Name,@RequestParam String type) {
		Account a=new Account();
		a.setName("Nithin");
		a.setType("Savings");
		System.out.println("Account holder "+Name+" type "+type);
		Accservice.saveAccount(a);
		return true;
	}
	@GetMapping(path="/microdetails")
	public boolean Accountdetails(@RequestParam String accId) {
		if(accId!=null) {
			if(accId.substring(0,2).equals("01")) {
				return true;
			}
		}return false;
	}
}

	