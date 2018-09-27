package sampletest;


@RestController
@RequestMapping("/")
public class SampleRestController {

	// whenever some one calls our service
	@GetMapping(value = "birds/{birdid}")
    public ResponseEntity<Animal> getAllanimals(@PathVariable("birdid") Long id) {
    	ResponseEntity<Animal> animal = // get the data of animals  from database and process //here need to call url to get the data from another system or data from database and process and need to send back to cleint as well
		return animal.getBody();

    }

	// whenever we want to call other service
	@GetMapping(value = "birds/{birdid}")
	public ResponseEntity<Animal> getAllanimals(@PathVariable("birdid") Long id) {
		// here need to call url to get the data from another system or data from
		// database and process and need to send back to cleint as well
		ClientResource resource = new ClientResource("http://localhost:8080/animals");

		Response response = resource.getResponse();

		if (response.getStatus().isSuccess()) {
			//process your logic
			System.out.println("Success! " + response.getStatus());
			System.out.println(response.getEntity().getText());
		} else {
			System.out.println("ERROR! " + response.getStatus());
			System.out.println(response.getEntity().getText());
		}

	}

}
