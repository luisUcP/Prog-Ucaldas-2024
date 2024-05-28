import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutoriales")
public class TutoController {
    private final TutorialRepository tutorialRepository;

    @Autowired
    public TutorialController(Repository  Repository) {
        this.tutorialRepository = tutorialRepository;
    }

    @PostMapping
    public Tutorial crearTutorial(@RequestBody Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    @GetMapping
    public List<Tutorial> listarTutoriales() {
        return tutorialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tutorial obtenerTutorialPorId(@PathVariable Long id) {
        return tutorialRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tutorial no encontrado"));
    }
}
