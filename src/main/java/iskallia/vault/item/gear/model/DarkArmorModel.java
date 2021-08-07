package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class DarkArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

    public DarkArmorModel(float modelSize, EquipmentSlotType slotType) {
        super(modelSize, slotType);

		textureWidth = 64;
		textureHeight = 64;
		
		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(54, 0).addBox(5.0F, -8.75F, -2.5F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(54, 0).addBox(-6.0F, -8.75F, -2.5F, 1.0F, 4.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(45, 4).addBox(-4.0F, -8.25F, -6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(45, 4).addBox(-0.5F, -11.25F, -5.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(51, 0).addBox(-0.75F, -0.6F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.setTextureOffset(45, 4).addBox(-3.0F, -9.75F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(45, 4).addBox(-1.5F, -10.25F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1309F);
		cube_r3.setTextureOffset(45, 4).addBox(2.0F, -9.75F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r3.setTextureOffset(45, 4).addBox(0.5F, -10.25F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.1309F, 1.4399F);
		cube_r4.setTextureOffset(45, 4).addBox(-7.75F, -5.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.1309F, -1.4399F);
		cube_r5.setTextureOffset(45, 4).addBox(2.75F, -5.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
		

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
		

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(46, 8).addBox(-4.0F, -7.5F, -5.25F, 8.0F, 8.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-8.0F, -7.0F, 0.0F);
		Head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.3491F, -0.3927F);
		cube_r9.setTextureOffset(48, 0).addBox(-2.0F, 0.0F, -2.0F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-8.0F, -7.0F, 0.0F);
		Head.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.8727F, 0.9163F);
		cube_r10.setTextureOffset(48, 0).addBox(-6.0F, 0.0F, -2.5F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, -15.0F, -3.0F);
		Head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 2.5307F, -1.4835F);
		cube_r11.setTextureOffset(48, 0).addBox(-3.8956F, -0.8252F, -0.0385F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.0F, -15.0F, -3.0F);
		Head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -2.5307F, 1.4835F);
		cube_r12.setTextureOffset(48, 0).addBox(-0.1044F, -0.8252F, -0.0385F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 2.5307F, -1.0036F);
		cube_r13.setTextureOffset(48, 0).addBox(-8.9037F, -2.25F, 2.6067F, 4.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -2.5307F, 1.0036F);
		cube_r14.setTextureOffset(48, 0).addBox(4.9037F, -2.25F, 2.6067F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 2.9671F, -0.5236F);
		cube_r15.setTextureOffset(48, 0).addBox(-4.9037F, -4.75F, -0.6433F, 4.0F, 2.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -2.9671F, 0.5236F);
		cube_r16.setTextureOffset(48, 0).addBox(0.9037F, -4.75F, -0.6433F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -2.8798F, -1.0036F);
		cube_r17.setTextureOffset(48, 0).addBox(-3.1537F, -3.75F, -1.6433F, 4.0F, 2.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(8.0F, -7.0F, -6.0F);
		Head.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 2.8798F, 1.0036F);
		cube_r18.setTextureOffset(48, 0).addBox(-0.8463F, -3.75F, -1.6433F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(8.0F, -7.0F, 0.0F);
		Head.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.8727F, -0.9163F);
		cube_r19.setTextureOffset(48, 0).addBox(0.0F, 0.0F, -2.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(8.0F, -7.0F, 0.0F);
		Head.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.3491F, 0.3927F);
		cube_r20.setTextureOffset(48, 0).addBox(-4.0F, 0.0F, -2.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(0, 50).addBox(-4.0F, -0.25F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 0).addBox(-4.0F, 0.75F, -4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -1.0036F);
		cube_r21.setTextureOffset(37, 2).addBox(-2.25F, -8.75F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, true);
		cube_r21.setTextureOffset(42, 7).addBox(-2.25F, -8.75F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r21.setTextureOffset(42, 7).addBox(-2.25F, -8.75F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r21.setTextureOffset(42, 7).addBox(-2.25F, -8.75F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 1.0036F);
		cube_r22.setTextureOffset(42, 7).addBox(1.25F, -8.75F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(42, 7).addBox(1.25F, -8.75F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(42, 7).addBox(1.25F, -8.75F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(37, 2).addBox(1.25F, -8.75F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(41, 19).addBox(-3.15F, -1.8F, -1.4F, 3.0F, 9.0F, 3.0F, 1.0F, false);
		RightArm.setTextureOffset(0, 32).addBox(-3.5F, -2.5F, -3.0F, 4.0F, 12.0F, 6.0F, 1.0F, false);

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightArm.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.setTextureOffset(60, 22).addBox(-1.0F, -6.25F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r23.setTextureOffset(60, 22).addBox(-1.0F, -6.75F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r23.setTextureOffset(60, 22).addBox(-1.0F, -6.25F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(0, 32).addBox(-0.5F, -2.5F, -3.0F, 4.0F, 12.0F, 6.0F, 1.0F, true);
		LeftArm.setTextureOffset(41, 19).addBox(0.15F, -1.8F, -1.4F, 3.0F, 9.0F, 3.0F, 1.0F, true);

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftArm.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.setTextureOffset(60, 22).addBox(0.0F, -6.25F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r24.setTextureOffset(60, 22).addBox(0.0F, -6.25F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r24.setTextureOffset(60, 22).addBox(0.0F, -6.75F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(40, 31).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 0.51F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(20, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(20, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}