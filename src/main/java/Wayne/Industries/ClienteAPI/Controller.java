package Wayne.Industries.ClienteAPI;

import Wayne.Industries.ClienteAPI.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1/cliente/")
public class Controller {
    @Autowired
    Repository repository;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = repository.save(cliente);
        return clienteSaved;
    }
    @GetMapping
    public List<Cliente> clienteReturned (){
        return repository.findAll();
    }

    @GetMapping (value = "/{id}")
    public Cliente findById (@PathVariable Long id) {
        Cliente clienteReturn = repository.findById(id).get();
        return clienteReturn;
    }



    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        try {
            Optional<Cliente> cliente  = Optional.of(repository.getById(id));
            if (cliente.isPresent()){
                repository.deleteById(id);
                return "Cliente de id 1 foi deletado com  sucesso";

            }
            else{
                throw new Exception();
            }
        }catch (Exception e ){
            e.printStackTrace();
            return "Cliente de id  não existe";

            }

        }
}











