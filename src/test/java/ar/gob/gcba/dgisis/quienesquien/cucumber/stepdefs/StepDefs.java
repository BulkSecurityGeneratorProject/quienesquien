package ar.gob.gcba.dgisis.quienesquien.cucumber.stepdefs;

import ar.gob.gcba.dgisis.quienesquien.QuienesquienApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = QuienesquienApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
