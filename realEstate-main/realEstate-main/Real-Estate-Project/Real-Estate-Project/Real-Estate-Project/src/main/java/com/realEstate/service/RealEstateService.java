package com.realEstate.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realEstate.entity.Agent;
import com.realEstate.entity.Client;
import com.realEstate.entity.Property;
import com.realEstate.repository.AgentRepository;
import com.realEstate.repository.ClientRepository;
import com.realEstate.repository.PropertyRepository;

@Service
public class RealEstateService {
	
	@Autowired
	AgentRepository agentRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	PropertyRepository propertyRepository;

	private List<Client> clients = new LinkedList<>();

	private List<Property> properties = new LinkedList<>();

	private List<Agent> agents = new LinkedList<>();

	
	
	
	@PostConstruct
	public Agent defaultAgent() {
		Agent a1 = new Agent(1, "Sarah", "Lawless", 7328567354L, "sarahlawless@claimrealty.com", "lawless");
		agents.add(a1);
		return a1;
		

	}

	public List<Agent> getAgents() {
		return agents;
	}

	public void saveClient(Client c1) {
		clientRepository.save(c1);
	}

	public List<Client> getClients() {
		return clientRepository.findAll();
	}
	
	public void deleteClientById(Integer id) {
		clientRepository.deleteById(id);
	}
	
	public void deleteAllClients() {
		clientRepository.deleteAll();
	}

	public void saveProperty(Property p1) {
		propertyRepository.save(p1);
	}

	public List<Property> getProperties() {
		return propertyRepository.findAll();
	}
	
	public Client findClientLogin(String email, String password) {
		return clientRepository.loginClient(email, password);
	}
	
	public Agent retrieveAgent(String email, String password) {
		return agentRepository.login(email, password);
	}

	public boolean findClient(Client c1) {
		for (int i = 0; i < clients.size(); i++) {
			if (c1.getEmail().equals(clients.get(i).getEmail())
					&& c1.getPassword().equals(clients.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}
	public Client getClientByEmailAndPassword(String email, String password) {
		return clientRepository.loginClient(email, password);
	}

	public Agent getAgentByEmailAndPassword(String email, String password) {
		Agent found = new Agent();
		for (Agent temp : agents) {
			if (temp.getEmail().equals(email) && temp.getPassword().equals(password)) {
				found = temp;
				return found;
			}

		}
		return null;
	}

	public boolean findAgent(Agent a1) {
		for (int i = 0; i < agents.size(); i++) {
			if (a1.getEmail().equals(agents.get(i).getEmail())
					&& a1.getPassword().equals(agents.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}


	public Optional<Property> getPropertyById(Integer id) {
        return Optional.of(propertyRepository.searchById(id));
    }
	
	 public Optional<Property> getPropertyBySize(Integer size) {
	        return Optional.of(propertyRepository.searchHouseSize(0));
	    }
	    public Optional<Property> getPropertyByCity(String city) {
	        return Optional.of(propertyRepository.searchCity(city));
	    }
	    public Optional<Property> getPropertyByState(String state) {
	        return Optional.of(propertyRepository.searchState(state));
	    }
	    public Optional<Property> getPropertyByPrice(Integer price) {
	        return Optional.of(propertyRepository.searchSalePrice(0));
	    }
	    public void saveStudent(Property p1) {
	        propertyRepository.save(p1);
	    }

	    public List<Property> getAllProperties() {
	        return propertyRepository.findAll();
	    }

	    public void deleteAllProperties() {
	        propertyRepository.deleteAll();
	    }

		public void savePurchase(Property property) {
		
			
		}
	
//		public void addJustPurchasedHouseToClientProfile(Integer Id, Integer id) {
//			Property p1 = new Property();
//			int id1 = 1;
//			p1.setId(id1++);
//			p1.setPurchaserClientId(id);
//			p1.setId(Id);
//			properties.add(p1);
//		}
	   
}
	

