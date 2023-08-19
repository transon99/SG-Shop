package com.spring_boot.SGShop.mapper;

import com.spring_boot.SGShop.dto.request.AddressRequest;
import com.spring_boot.SGShop.dto.response.AddressResponse;
import com.spring_boot.SGShop.modal.Address;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddressMapper {
    private final ModelMapper mapper;

    private Address mapToEntity(AddressRequest addressRequest) {
        return mapper.map(addressRequest, Address.class);
    }

    private AddressResponse mapToResponse(Address address) {
        return mapper.map(address, AddressResponse.class);
    }
}
