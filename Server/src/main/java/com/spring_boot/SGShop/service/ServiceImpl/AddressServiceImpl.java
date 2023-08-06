//package com.spring_boot.SGShop.Service.ServiceImpl;
//
//import com.spring_boot.SGShop.modal.Address;
//import com.spring_boot.SGShop.repository.AddressRepository;
//import com.spring_boot.SGShop.Service.AddressService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class AddressServiceImpl implements AddressService {
//    @Autowired
//    AddressRepository addressRepository;
//
//    @Override
//    public List<Address> getAllAddress() {
//
//        return null;
//    }
//
//    @Override
//    public Optional<Address> getAddressById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Address inserAddress(Address address) {
//        addressRepository.save(address);
//        return address;
//    }
//
//    @Override
//    public String deleteUser(Long id) {
//        return null;
//    }
//
//    @Override
//    public Optional<Address> updateUser(Long id, Address address) {
//        return Optional.empty();
//    }
//}
