import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
    @Test
    public void ボタンを押すとコーラが出る() {
        // 準備 Arrange
        // 実行 Act
        VendingMachine sut = new VendingMachine();
        String bevarage = sut.buy();
        // 検証 Assert
        assertEquals("コーラ", bevarage);
    }

@Test
    public void _100円コインを投入してからボタンを押すとコーラが出ます() {
        // 準備 Arrange
        // 実行 Act
        VendingMachine sut = new VendingMachine();
        sut.insert100Yen(); 
        String bevarage = sut.buy();
        // 検証 Assert
        assertEquals("コーラ", bevarage);
    }
@Test
    public void _100円コインを投入しないでボタンを押すとコーラが出ない() {
        // 準備 Arrange
        // 実行 Act
        VendingMachine sut = new VendingMachine();
        String bevarage = sut.buy();
        // 検証 Assert
        assertEquals(null, bevarage);
    }
}
