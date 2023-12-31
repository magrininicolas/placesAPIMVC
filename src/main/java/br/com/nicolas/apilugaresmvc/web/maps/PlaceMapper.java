package br.com.nicolas.apilugaresmvc.web.maps;

import br.com.nicolas.apilugaresmvc.api.dto.PlaceResponseDTO;
import br.com.nicolas.apilugaresmvc.domain.entities.PlaceModel;

public class PlaceMapper {

  public static PlaceResponseDTO fromPlaceToResponse(PlaceModel place) {
    return new PlaceResponseDTO(
        place.getName(), place.getSlug(), place.getCity(),
        place.getState(), place.getCreatedAt(), place.getUpdatedAt());
  }
}
