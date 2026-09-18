package chapter6.chapter6A4;

import java.util.List;

/*
Растение. Возможности: 
- задать и редактировать информацию о растении;
- получить информацию об имеющихся растениях в оранжерее/растениях определенного вида/месте происхождения;
- закупить новый вид растений;
- произвести полив;
- задать температуру;
- установить освещение;
- выкопать определенный вид растений (убрать из оранжереи).
 */
public interface GreenhouseManagement {

	void updatePlantInfo(Plant plant);

	List<Plant> getAllPlants();

	List<Plant> getPlantsBySpecies(String species);

	List<Plant> getPlantsByOrigin(String origin);

	void purchaseNewPlant(Plant plant);

	void water();

	void setTemperature(double temperature);

	void setLighting(double lightLevel);

	void removePlantBySpecies(Plant plant);

}
