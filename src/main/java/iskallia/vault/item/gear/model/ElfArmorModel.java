
package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class ElfArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

	public ElfArmorModel(float modelSize, EquipmentSlotType slotType) {

		super(modelSize, slotType);
		textureWidth = 64;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 12).addBox(-5.0F, -8.75F, -5.25F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.0F, -8.75F, -5.25F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.5F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 20).addBox(-0.5F, -8.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(17, 20).addBox(-0.5F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(17, 17).addBox(0.75F, -7.25F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 3).addBox(-0.5F, -9.0F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 17).addBox(-1.75F, -7.25F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 5).addBox(-0.5F, -7.75F, -5.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 14).addBox(0.75F, -9.0F, -5.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 9).addBox(-0.5F, -9.25F, -5.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(15, 13).addBox(-0.5F, -9.0F, -4.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 15).addBox(-0.75F, -9.0F, -5.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(15, 14).addBox(-0.5F, -9.0F, -6.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(7, 3).addBox(-4.5F, -9.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.5F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 3).addBox(-5.5F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 5).addBox(-5.5F, -8.5F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 3).addBox(-5.5F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 5).addBox(3.5F, -9.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(2, 2).addBox(4.5F, -8.5F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(2, 2).addBox(4.5F, -8.5F, 1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 5).addBox(-5.5F, -8.5F, 1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(7, 13).addBox(3.5F, -9.0F, 1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(4, 12).addBox(-4.5F, -9.0F, 1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.5F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 3).addBox(-5.5F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 25.0F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 3.1416F, 0.0F);
		Head_r1.setTextureOffset(7, 0).addBox(-0.5F, -32.25F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r19 = new ModelRenderer(this);
		Head_r19.setRotationPoint(1.1826F, -2.9996F, 0.7056F);
		Head.addChild(Head_r19);
		setRotationAngle(Head_r19, 0.3054F, 0.3491F, 0.0F);
		Head_r19.setTextureOffset(0, 28).addBox(-4.5F, -7.0F, -2.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(-1.1826F, -2.9996F, 0.7056F);
		Head.addChild(Head_r18);
		setRotationAngle(Head_r18, 0.3054F, -0.3491F, 0.0F);
		Head_r18.setTextureOffset(0, 28).addBox(3.5F, -7.0F, -2.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(0.1477F, -2.9996F, 4.3996F);
		Head.addChild(Head_r17);
		setRotationAngle(Head_r17, 0.3054F, 0.6981F, 0.0F);
		Head_r17.setTextureOffset(0, 28).addBox(-2.5F, -7.0F, -2.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(-0.1477F, -2.9996F, 4.3996F);
		Head.addChild(Head_r16);
		setRotationAngle(Head_r16, 0.3054F, -0.6981F, 0.0F);
		Head_r16.setTextureOffset(0, 28).addBox(1.5F, -7.0F, -2.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(0.0F, -6.0F, 0.0F);
		Head.addChild(Head_r15);
		setRotationAngle(Head_r15, 0.0F, 0.0F, -1.2217F);
		Head_r15.setTextureOffset(0, 5).addBox(0.0F, -4.75F, -5.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Head_r15.setTextureOffset(23, 0).addBox(3.0F, 1.25F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r15.setTextureOffset(18, 3).addBox(2.0F, 0.25F, -5.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r15.setTextureOffset(6, 5).addBox(0.25F, -2.5F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(0.0F, -6.0F, 0.0F);
		Head.addChild(Head_r14);
		setRotationAngle(Head_r14, 0.0F, 0.0F, 1.2217F);
		Head_r14.setTextureOffset(18, 0).addBox(-3.0F, 0.25F, -5.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r14.setTextureOffset(18, 6).addBox(-4.0F, 1.25F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r14.setTextureOffset(6, 5).addBox(-1.25F, -2.5F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head_r14.setTextureOffset(6, 5).addBox(-1.0F, -4.75F, -5.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(0.0F, -6.0F, 0.0F);
		Head.addChild(Head_r13);
		setRotationAngle(Head_r13, 0.0F, 0.0F, -0.6981F);
		Head_r13.setTextureOffset(0, 2).addBox(-1.75F, -3.75F, -5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r13.setTextureOffset(0, 17).addBox(-0.75F, -1.75F, -5.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(0.0F, -6.0F, 0.25F);
		Head.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.0F, 0.0F, 0.6981F);
		Head_r12.setTextureOffset(4, 5).addBox(1.75F, -3.75F, -5.45F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Head_r12.setTextureOffset(4, 17).addBox(-0.25F, -1.75F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(Head_r11);
		setRotationAngle(Head_r11, 0.0F, -1.5708F, 0.0F);
		Head_r11.setTextureOffset(0, 12).addBox(5.0F, 0.5F, 2.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r11.setTextureOffset(13, 0).addBox(5.0F, 0.5F, -4.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(40, 42).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(46, 40).addBox(-4.0F, -0.25F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(46, 35).addBox(-4.0F, 0.75F, -4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(16, 42).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 0.51F, false);

		ModelRenderer Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(5.0F, -0.75F, -3.75F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 0.0F, -0.7418F);
		Body_r1.setTextureOffset(50, 40).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(-5.0F, -0.75F, -3.75F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, 0.7418F);
		Body_r2.setTextureOffset(50, 40).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(48, 20).addBox(-2.735F, -1.42F, -1.41F, 3.0F, 8.0F, 3.0F, 1.0F, false);
		RightArm.setTextureOffset(29, 18).addBox(-3.5F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		ModelRenderer ShoulderPad2 = new ModelRenderer(this);
		ShoulderPad2.setRotationPoint(2.0F, -1.0F, 0.0F);
		RightArm.addChild(ShoulderPad2);
		setRotationAngle(ShoulderPad2, 0.0F, 0.0F, -0.2618F);
		

		ModelRenderer cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(-4.1118F, -3.6382F, -2.5F);
		ShoulderPad2.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, 0.5236F, -0.3491F, -0.4363F);
		cube_r26_r1.setTextureOffset(52, 10).addBox(0.7737F, -2.2669F, -1.4008F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		ModelRenderer cube_r24_r1 = new ModelRenderer(this);
		cube_r24_r1.setRotationPoint(-4.1118F, -3.6382F, 2.5F);
		ShoulderPad2.addChild(cube_r24_r1);
		setRotationAngle(cube_r24_r1, -0.5236F, 0.3491F, -0.4363F);
		cube_r24_r1.setTextureOffset(52, 10).addBox(0.7833F, -2.2057F, -3.7663F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-7.75F, -4.5F, 0.0F);
		ShoulderPad2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
		cube_r1.setTextureOffset(56, 8).addBox(0.3452F, -2.3126F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-8.0F, -2.0F, 0.0F);
		ShoulderPad2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.1345F);
		cube_r2.setTextureOffset(36, 0).addBox(2.2808F, 0.9942F, -4.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r2.setTextureOffset(36, 0).addBox(2.2808F, 0.9942F, 3.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r2.setTextureOffset(44, 0).addBox(1.4696F, -1.8473F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-11.5F, -2.0F, 0.0F);
		ShoulderPad2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
		cube_r3.setTextureOffset(60, 6).addBox(2.3452F, -2.3126F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.75F, -3.3F, 2.75F);
		ShoulderPad2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2547F, -0.2599F, -0.1466F);
		cube_r4.setTextureOffset(54, 0).addBox(-0.7324F, -2.3277F, -0.2351F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.75F, -3.3F, -2.75F);
		ShoulderPad2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2547F, 0.2599F, -0.1466F);
		cube_r5.setTextureOffset(54, 0).addBox(-0.7324F, -2.3277F, -0.7649F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-8.0F, -2.3F, 3.25F);
		ShoulderPad2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2292F, -0.0872F, -0.1858F);
		cube_r6.setTextureOffset(56, 2).addBox(0.3624F, -2.2729F, -0.1638F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-8.0F, -2.3F, -3.25F);
		ShoulderPad2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2292F, 0.0872F, -0.1858F);
		cube_r7.setTextureOffset(56, 2).addBox(0.3624F, -2.2729F, -0.8362F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-7.25F, -1.3F, 3.25F);
		ShoulderPad2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2292F, -0.0872F, -0.404F);
		cube_r8.setTextureOffset(56, 2).addBox(0.7307F, -2.0562F, -0.2474F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-7.25F, -1.3F, -3.25F);
		ShoulderPad2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2292F, 0.0872F, -0.404F);
		cube_r9.setTextureOffset(56, 2).addBox(0.7307F, -2.0562F, -0.7526F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-6.75F, -0.05F, 3.0F);
		ShoulderPad2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2465F, -0.1273F, -0.4931F);
		cube_r10.setTextureOffset(58, 4).addBox(1.8594F, -1.9551F, -0.3133F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-6.75F, -0.05F, -3.0F);
		ShoulderPad2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2465F, 0.1273F, -0.4931F);
		cube_r11.setTextureOffset(58, 4).addBox(1.8594F, -1.9551F, -0.6867F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-11.25F, -2.05F, 2.75F);
		ShoulderPad2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0506F, 0.1267F, -0.4382F);
		cube_r12.setTextureOffset(54, 0).addBox(-0.222F, -2.0195F, -0.26F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-11.25F, -2.05F, -2.75F);
		ShoulderPad2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0506F, -0.1267F, -0.4382F);
		cube_r13.setTextureOffset(54, 0).addBox(-0.222F, -2.0195F, -0.74F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-10.5F, -0.8F, 3.5F);
		ShoulderPad2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0506F, 0.1267F, -0.6127F);
		cube_r14.setTextureOffset(54, 0).addBox(0.0221F, -1.7713F, -0.2415F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-10.5F, -0.8F, -3.5F);
		ShoulderPad2.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0506F, -0.1267F, -0.6127F);
		cube_r15.setTextureOffset(54, 0).addBox(0.0221F, -1.7713F, -0.7585F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-9.5F, 0.2F, 2.75F);
		ShoulderPad2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2769F, -0.1951F, -0.6206F);
		cube_r16.setTextureOffset(54, 0).addBox(0.0152F, -1.8041F, -0.4407F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-9.5F, 0.2F, -2.75F);
		ShoulderPad2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2769F, 0.1951F, -0.6206F);
		cube_r17.setTextureOffset(54, 0).addBox(0.0152F, -1.8041F, -0.5593F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-8.0F, 0.95F, 2.25F);
		ShoulderPad2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.3564F, -0.3009F, -0.6401F);
		cube_r18.setTextureOffset(56, 2).addBox(0.9985F, -1.8245F, -0.503F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-8.0F, 0.95F, -2.25F);
		ShoulderPad2.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3564F, 0.3009F, -0.6401F);
		cube_r19.setTextureOffset(56, 2).addBox(0.9985F, -1.8245F, -0.497F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-7.75F, -2.5F, 0.0F);
		ShoulderPad2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.1345F);
		cube_r20.setTextureOffset(29, 5).addBox(0.4696F, 0.1527F, -3.5F, 4.0F, 4.0F, 7.0F, 0.0F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(48, 20).addBox(-0.265F, -1.42F, -1.41F, 3.0F, 8.0F, 3.0F, 1.0F, true);
		LeftArm.setTextureOffset(29, 18).addBox(-0.5F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		ModelRenderer ShoulderPad = new ModelRenderer(this);
		ShoulderPad.setRotationPoint(-2.0F, -1.0F, 0.0F);
		LeftArm.addChild(ShoulderPad);
		setRotationAngle(ShoulderPad, 0.0F, 0.0F, 0.2618F);
		

		ModelRenderer cube_r25_r1 = new ModelRenderer(this);
		cube_r25_r1.setRotationPoint(4.1118F, -3.6382F, -2.5F);
		ShoulderPad.addChild(cube_r25_r1);
		setRotationAngle(cube_r25_r1, 0.5236F, 0.3491F, 0.4363F);
		cube_r25_r1.setTextureOffset(52, 10).addBox(-1.7737F, -2.2669F, -1.4008F, 1.0F, 1.0F, 5.0F, 0.0F, true);

		ModelRenderer cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(4.1118F, -3.6382F, 2.5F);
		ShoulderPad.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, -0.5236F, -0.3491F, 0.4363F);
		cube_r23_r1.setTextureOffset(52, 10).addBox(-1.7833F, -2.2057F, -3.7663F, 1.0F, 1.0F, 5.0F, 0.0F, true);

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(7.75F, -4.5F, 0.0F);
		ShoulderPad.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.1745F);
		cube_r21.setTextureOffset(56, 8).addBox(-3.3452F, -2.3126F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(11.5F, -2.0F, 0.0F);
		ShoulderPad.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.1745F);
		cube_r22.setTextureOffset(60, 6).addBox(-3.3452F, -2.3126F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(7.75F, -3.3F, 2.75F);
		ShoulderPad.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.2547F, 0.2599F, 0.1466F);
		cube_r23.setTextureOffset(54, 0).addBox(-3.2676F, -2.3277F, -0.2351F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(7.75F, -3.3F, -2.75F);
		ShoulderPad.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2547F, -0.2599F, 0.1466F);
		cube_r24.setTextureOffset(54, 0).addBox(-3.2676F, -2.3277F, -0.7649F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(8.0F, -2.3F, 3.25F);
		ShoulderPad.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.2292F, 0.0872F, 0.1858F);
		cube_r25.setTextureOffset(56, 2).addBox(-3.3624F, -2.2729F, -0.1638F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(8.0F, -2.3F, -3.25F);
		ShoulderPad.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.2292F, -0.0872F, 0.1858F);
		cube_r26.setTextureOffset(56, 2).addBox(-3.3624F, -2.2729F, -0.8362F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(7.25F, -1.3F, 3.25F);
		ShoulderPad.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.2292F, 0.0872F, 0.404F);
		cube_r27.setTextureOffset(56, 2).addBox(-3.7307F, -2.0562F, -0.2474F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(7.25F, -1.3F, -3.25F);
		ShoulderPad.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.2292F, -0.0872F, 0.404F);
		cube_r28.setTextureOffset(56, 2).addBox(-3.7307F, -2.0562F, -0.7526F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(6.75F, -0.05F, 3.0F);
		ShoulderPad.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.2465F, 0.1273F, 0.4931F);
		cube_r29.setTextureOffset(58, 4).addBox(-3.8594F, -1.9551F, -0.3133F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(6.75F, -0.05F, -3.0F);
		ShoulderPad.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2465F, -0.1273F, 0.4931F);
		cube_r30.setTextureOffset(58, 4).addBox(-3.8594F, -1.9551F, -0.6867F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(11.25F, -2.05F, 2.75F);
		ShoulderPad.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0506F, -0.1267F, 0.4382F);
		cube_r31.setTextureOffset(54, 0).addBox(-3.778F, -2.0195F, -0.26F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(11.25F, -2.05F, -2.75F);
		ShoulderPad.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.0506F, 0.1267F, 0.4382F);
		cube_r32.setTextureOffset(54, 0).addBox(-3.778F, -2.0195F, -0.74F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(10.5F, -0.8F, 3.5F);
		ShoulderPad.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0506F, -0.1267F, 0.6127F);
		cube_r33.setTextureOffset(54, 0).addBox(-4.0221F, -1.7713F, -0.2415F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(10.5F, -0.8F, -3.5F);
		ShoulderPad.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.0506F, 0.1267F, 0.6127F);
		cube_r34.setTextureOffset(54, 0).addBox(-4.0221F, -1.7713F, -0.7585F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(9.5F, 0.2F, 2.75F);
		ShoulderPad.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.2769F, 0.1951F, 0.6206F);
		cube_r35.setTextureOffset(54, 0).addBox(-4.0152F, -1.8041F, -0.4407F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(9.5F, 0.2F, -2.75F);
		ShoulderPad.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.2769F, -0.1951F, 0.6206F);
		cube_r36.setTextureOffset(54, 0).addBox(-4.0152F, -1.8041F, -0.5593F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(8.0F, 0.95F, 2.25F);
		ShoulderPad.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.3564F, 0.3009F, 0.6401F);
		cube_r37.setTextureOffset(56, 2).addBox(-3.9985F, -1.8245F, -0.503F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(8.0F, 0.95F, -2.25F);
		ShoulderPad.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.3564F, -0.3009F, 0.6401F);
		cube_r38.setTextureOffset(56, 2).addBox(-3.9985F, -1.8245F, -0.497F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer  cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(7.75F, -2.5F, 0.0F);
		ShoulderPad.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, 1.1345F);
		cube_r39.setTextureOffset(29, 5).addBox(-4.4696F, 0.1527F, -3.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		ModelRenderer cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(8.0F, -2.0F, 0.0F);
		ShoulderPad.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 1.1345F);
		cube_r40.setTextureOffset(36, 0).addBox(-5.2808F, 0.9942F, 3.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r40.setTextureOffset(36, 0).addBox(-5.2808F, 0.9942F, -4.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r40.setTextureOffset(44, 0).addBox(-4.4696F, -1.8473F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.setTextureOffset(0, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.setTextureOffset(0, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 0.51F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(0, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(0, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}