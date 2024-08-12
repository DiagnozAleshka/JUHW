package ru.netology.qa123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
CashbackHackService service = new CashbackHackService();
@Test
public void shouldAmountEqual1000(){
int ammount = 800;
int expected =200;
int actuall = service.remain(ammount);
assertEquals(expected,actuall);
}

}