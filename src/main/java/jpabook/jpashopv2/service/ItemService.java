package jpabook.jpashopv2.service;

import jpabook.jpashopv2.domain.item.Item;
import jpabook.jpashopv2.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

//  영속상태 엔티티를 가져와서 변경감지로 변경하는 방법법
//   @Transactional
//    public void updateItem(Long itemId, Book bookParam) {
//        Item findItem = itemRepository.findOne(itemId);
//        findItem.set...(bookParam.get...
//    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}
