package hei.school.soratra.endpoint.sorasoratraController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SoratraController {

    private Map<String, String> poemeStorage = new HashMap<>();

    @PutMapping("/soratra/{id}")
    public ResponseEntity<Object> putSoratra(@RequestBody String poeme, @PathVariable String id) {
        poemeStorage.put(id, poeme);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping("/soratra/{id}")
    public ResponseEntity<Object> getSoratra(@PathVariable String id) {
        String originalUrl = generateOriginalUrl(id);
        String transformedUrl = generateTransformedUrl(id);
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("original_url", originalUrl);
        responseBody.put("transformed_url", transformedUrl);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    private String generateTransformedUrl(String id) {
        return null;
    }

    private String generateOriginalUrl(String id) {
        return null;
    }
}
