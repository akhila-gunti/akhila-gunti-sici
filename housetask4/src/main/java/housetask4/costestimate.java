package housetask4;

public class costestimate {

		 private final double costOfStandardMaterial = 1200;

		    private final double costOfAboveStandardMaterial = 1500;

		    private final double costOfHighStandardMaterial = 1800;

		    private final double costOfHighStandardMaterialAndAutomation = 2500;



		    public double getCost(double area, String materialType, boolean automation) throws invalidmaterialselect {

		        double MaterialCost = getMaterialCost(materialType, automation);



		        return (area * MaterialCost);

		    }



		    private double getMaterialCost(String materialStandard, boolean automation) throws invalidmaterialselect {

		        if (materialStandard.toLowerCase().equals(materialstandards.Standards.standardMaterial.toString().toLowerCase())) {

		            return costOfStandardMaterial;

		        } else if (materialStandard.toLowerCase().equals(materialstandards.Standards.AboveStandardMaterial.toString().toLowerCase())) {

		            return costOfAboveStandardMaterial;

		        } else {

		            boolean material = materialStandard.toLowerCase().equals(materialstandards.Standards.HighStandardMaterial.toString().toLowerCase());

		            if (material && !automation) {

		                return costOfHighStandardMaterial;

		            } else if (material && automation) {

		                return costOfHighStandardMaterialAndAutomation;

		            } else {

		                throw new invalidmaterialselect(materialStandard);

		            }

		        }

		    }

}
