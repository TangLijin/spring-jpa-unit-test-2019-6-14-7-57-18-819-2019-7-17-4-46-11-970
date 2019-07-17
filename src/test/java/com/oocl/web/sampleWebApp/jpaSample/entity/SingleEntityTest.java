package com.oocl.web.sampleWebApp.jpaSample.entity;

import org.junit.jupiter.api.Assertions;

import javax.persistence.Entity;
import java.util.List;

class SingleEntityTest {


    public void should_return_entity_when_the_entity_exist() {
        //given
        Entity entity = new Entity();
        entity.setName("test");
        entityRepository.save(user);

        //when
        List<Entity> entityList = entityRepository.findAll();

        //then
        Assertions.assertEquals(1, userList.size());
        Assertions.assertEquals("test", userList.get(0).getName());
    }

}