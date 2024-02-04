Feature: Baykartech Navbar kontrolu, web sayfasi dil kontrolu ve kariyer sayfasi test senaryolari
  @NavbarTest
  Scenario: Navbar elements kontrolu
    Given Ziyaretci anasayfadadir
    Given Popup kapatilir
    Then Navbar elementlerine tiklanir

    @LanguageTest
    Scenario: Dil sayfalari arasinda gecis
      Given Ziyaretci anasayfadadir
      Given Popup kapatilir
      Then ingilizce web sayfasina gecis yapar
      Then Popup kapatilir
      Then Turkce web sayfasina gecis yapar
      Then Popup kapatilir

      @CareerTest
      Scenario: Baykartech kariyer sayfasindan acik pozisyon arama
        Given Ziyaretci Baykartech kariyer sayfasindadir
        Given Acik pozisyonlar linkine tiklar
        Given Tum acik pozisyonlar linkine tiklar
        When Birimlerden uretim yonetimini secer
        When Arama alanina ana veri yazar
        Then Ana veri personeli ilanina tiklar