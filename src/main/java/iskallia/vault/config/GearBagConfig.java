package iskallia.vault.config;

import com.google.gson.annotations.Expose;
import iskallia.vault.util.WeightedList;
import iskallia.vault.vending.Product;
import net.minecraft.item.Items;

public class GearBagConfig extends Config {

	@Expose public WeightedList<Product> POOL = new WeightedList<>();

	@Override
	public String getName() {
		return "gear_bag";
	}

	@Override
	protected void reset() {
		this.POOL.add(new Product(Items.APPLE, 8, null), 3);
		this.POOL.add(new Product(Items.GOLDEN_APPLE, 1, null), 1);
	}

}
