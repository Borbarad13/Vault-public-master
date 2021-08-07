
package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class EggArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

	public EggArmorModel(float modelSize, EquipmentSlotType slotType) {

		super(modelSize, slotType);
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(86, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(86, 0).addBox(-5.0F, -8.7F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(120, 20).addBox(-0.75F, -10.25F, -0.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(88, 11).addBox(-5.0F, -8.75F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.5F, -8.25F, 0.25F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, -0.2618F, 0.0F);
		Head_r1.setTextureOffset(110, 11).addBox(-3.0F, -1.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.25F, -8.75F, 0.25F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, -0.3927F, 0.0F);
		Head_r2.setTextureOffset(116, 16).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(94, 77).addBox(-8.0F, -2.5F, -3.0F, 16.0F, 16.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(94, 70).addBox(-5.5F, 4.75F, -2.5F, 11.0F, 2.0F, 5.0F, 0.0F, false);

		ModelRenderer Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 6.0F, -3.5F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 0.0F, 1.8326F);
		Body_r1.setTextureOffset(102, 94).addBox(-1.0F, -1.0F, -0.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(1.0133F, 7.048F, -2.65F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, -2.5307F);
		Body_r2.setTextureOffset(116, 94).addBox(-2.0F, -2.75F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 6.0F, -3.25F);
		Body.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 0.0F, 0.3491F);
		Body_r3.setTextureOffset(116, 94).addBox(-3.75F, -2.5F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 6.0F, -3.0F);
		Body.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 0.0F, 0.0436F);
		Body_r4.setTextureOffset(108, 94).addBox(-1.5F, -1.25F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-19.0F, 16.95F, 2.0F);
		RightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
		cube_r1.setTextureOffset(0, 52).addBox(15.5F, 11.25F, -3.4F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 46).addBox(14.5F, 11.75F, -4.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 14).addBox(14.0F, 12.75F, -4.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 34).addBox(13.5F, 13.75F, -5.4F, 7.0F, 5.0F, 7.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 27).addBox(14.0F, 18.75F, -4.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(19.0F, 16.95F, 2.0F);
		LeftArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.setTextureOffset(0, 52).addBox(-18.5F, 11.25F, -3.4F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 46).addBox(-19.5F, 11.75F, -4.4F, 5.0F, 1.0F, 5.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 14).addBox(-20.0F, 12.75F, -4.9F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 34).addBox(-20.5F, 13.75F, -5.4F, 7.0F, 5.0F, 7.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 27).addBox(-20.0F, 18.75F, -4.9F, 6.0F, 1.0F, 6.0F, 0.0F, true);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(94, 70).addBox(-4.5F, 9.75F, -2.5F, 9.0F, 2.0F, 5.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(29, 46).addBox(-2.3F, 4.15F, -3.4F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 36).addBox(-2.8F, 0.15F, -3.9F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 31).addBox(-2.3F, -0.85F, -3.4F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 51).addBox(-1.8F, -1.35F, -2.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 26).addBox(-1.8F, -1.35F, -0.15F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 6).addBox(-2.3F, -0.85F, -0.65F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 11).addBox(-2.8F, 0.15F, -1.15F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 21).addBox(-2.3F, 4.15F, -0.65F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 21).addBox(-2.3F, 10.4F, -1.4F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 11).addBox(-2.8F, 6.4F, -1.9F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 6).addBox(-2.3F, 5.4F, -1.4F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 26).addBox(-1.8F, 4.9F, -0.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 46).addBox(-2.3F, 10.4F, -2.65F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 36).addBox(-2.8F, 6.4F, -3.15F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 31).addBox(-2.3F, 5.4F, -2.65F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(29, 51).addBox(-1.8F, 4.9F, -2.15F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(29, 46).addBox(-1.7F, 4.15F, -3.4F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 36).addBox(-2.2F, 0.15F, -3.9F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 31).addBox(-1.7F, -0.85F, -3.4F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 51).addBox(-1.2F, -1.35F, -2.9F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 26).addBox(-1.2F, -1.35F, -0.15F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 6).addBox(-1.7F, -0.85F, -0.65F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 11).addBox(-2.2F, 0.15F, -1.15F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 21).addBox(-1.7F, 4.15F, -0.65F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 21).addBox(-1.7F, 10.4F, -1.4F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 11).addBox(-2.2F, 6.4F, -1.9F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 6).addBox(-1.7F, 5.4F, -1.4F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 26).addBox(-1.2F, 4.9F, -0.9F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 46).addBox(-1.7F, 10.4F, -2.65F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 36).addBox(-2.2F, 6.4F, -3.15F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 31).addBox(-1.7F, 5.4F, -2.65F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(29, 51).addBox(-1.2F, 4.9F, -2.15F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 11.0F, 0.0F);
		

		ModelRenderer cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(-0.3F, 10.4F, -1.4F);
		RightBoot.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -1.5708F, 3.1416F, 0.0F);
		cube_r3_r1.setTextureOffset(29, 51).addBox(-1.4F, -4.75F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r3_r1.setTextureOffset(29, 31).addBox(-1.9F, -4.25F, -0.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3_r1.setTextureOffset(29, 36).addBox(-2.4F, -3.25F, -1.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r3_r1.setTextureOffset(29, 46).addBox(-1.9F, 4.0F, -0.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 11.0F, 0.0F);
		

		ModelRenderer cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(0.3F, 10.4F, -1.4F);
		LeftBoot.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, -1.5708F, -3.1416F, 0.0F);
		cube_r4_r1.setTextureOffset(29, 46).addBox(-2.1F, 4.0F, -0.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		cube_r4_r1.setTextureOffset(29, 51).addBox(-1.6F, -4.75F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		cube_r4_r1.setTextureOffset(29, 31).addBox(-2.1F, -4.25F, -0.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		cube_r4_r1.setTextureOffset(29, 36).addBox(-2.6F, -3.25F, -1.0F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}