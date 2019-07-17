//package com.oocl.web.sampleWebApp.jpaSample.repository;
//
//import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class EntityRepositoryTest {
//
//    @Autowired
//    private EntityRepository entityRepository;
//
//    @Test
//    public void should_create_and_return_entity_when_the_create_entity() {
//        //given
//        SingleEntity singleEntity = new SingleEntity();
//        singleEntity.setName("test");
//        entityRepository.save(singleEntity);
//
//        //when
//        List<SingleEntity> entityList = entityRepository.findAll();
//
//        //then
//        Assertions.assertEquals(1, entityList.size());
//        Assertions.assertEquals("test", entityList.get(0).getName());
//    }
//
//}