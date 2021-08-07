
package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class GundamArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

	public GundamArmorModel(float modelSize, EquipmentSlotType slotType) {

		super(modelSize, slotType);
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(86, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(90, 2).addBox(-1.0F, -9.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(78, 10).addBox(-1.0F, -0.25F, -4.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(78, 1).addBox(-1.5F, -12.0F, -2.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(58, 0).addBox(-2.499F, -10.5F, -2.2F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(84, 17).addBox(5.99F, -7.0F, -3.25F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(64, 0).addBox(4.99F, -8.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(64, 0).addBox(4.99F, -3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(77, 20).addBox(4.99F, -5.0F, -4.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(77, 20).addBox(-6.01F, -5.0F, -4.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.99F, -2.0F, -3.25F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(116, 0).addBox(4.0F, -8.0F, -2.25F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(65, 18).addBox(4.5F, -8.5F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(65, 18).addBox(-5.5F, -8.5F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(116, 0).addBox(-6.0F, -8.0F, -2.25F, 2.0F, 6.0F, 4.0F, 0.0F, true);
		Head.setTextureOffset(64, 0).addBox(-5.99F, -8.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(64, 0).addBox(-5.99F, -3.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(84, 17).addBox(-5.99F, -7.0F, -3.25F, 0.0F, 4.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(78, 14).addBox(-0.5F, -12.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(73, 1).addBox(-1.5F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(62, 12).addBox(-3.0F, -6.25F, -6.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(3.0F, -5.75F, -5.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.7854F, 0.0F);
		Head_r1.setTextureOffset(62, 15).addBox(-1.25F, -0.5F, -0.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(-3.0F, -5.75F, -5.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, -0.7854F, 0.0F);
		Head_r2.setTextureOffset(70, 15).addBox(-0.75F, -0.5F, -0.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.0F, 0.75F, -4.0F);
		Head.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 0.0F, -0.7854F);
		Head_r3.setTextureOffset(80, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(0.0F, -7.0F, -5.25F);
		Head.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, 0.0F, -0.7854F);
		Head_r4.setTextureOffset(92, 5).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(3.0F, -8.5F, -5.5F);
		Head.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0F, -0.2182F, -0.5236F);
		Head_r5.setTextureOffset(117, 20).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(4.9907F, -10.4985F, -3.9232F);
		Head.addChild(Head_r6);
		setRotationAngle(Head_r6, -0.7854F, -0.2182F, -0.5236F);
		Head_r6.setTextureOffset(78, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(-4.849F, -10.7222F, -3.8744F);
		Head.addChild(Head_r7);
		setRotationAngle(Head_r7, -0.7854F, 0.2182F, 0.5236F);
		Head_r7.setTextureOffset(78, 5).addBox(-1.0F, -0.25F, -0.4F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(-3.0F, -8.5F, -5.5F);
		Head.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0F, 0.2182F, 0.5236F);
		Head_r8.setTextureOffset(117, 20).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(1.0F, -10.5F, -3.0F);
		Head.addChild(Head_r9);
		setRotationAngle(Head_r9, -3.1416F, 0.0F, 3.1416F);
		Head_r9.setTextureOffset(73, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(0.0F, -10.5F, 3.5F);
		Head.addChild(Head_r10);
		setRotationAngle(Head_r10, -0.7854F, 0.0F, 0.0F);
		Head_r10.setTextureOffset(80, 1).addBox(-0.5F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head_r10.setTextureOffset(73, 1).addBox(-1.5F, -1.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head_r10.setTextureOffset(83, 20).addBox(-1.499F, -1.0F, -1.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(1.0F, -7.6716F, 5.6213F);
		Head.addChild(Head_r11);
		setRotationAngle(Head_r11, -2.3562F, 0.0F, 3.1416F);
		Head_r11.setTextureOffset(73, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(0.0F, -9.5F, 2.55F);
		Head.addChild(Head_r12);
		setRotationAngle(Head_r12, -0.7854F, 0.0F, 0.0F);
		Head_r12.setTextureOffset(62, 7).addBox(-2.5F, -0.9F, -0.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(-5.0F, -6.5F, 3.25F);
		Head.addChild(Head_r13);
		setRotationAngle(Head_r13, 0.0F, 0.5236F, 0.0F);
		Head_r13.setTextureOffset(97, 20).addBox(0.0F, -1.5F, -1.75F, 2.0F, 6.0F, 3.0F, 0.0F, true);

		ModelRenderer Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(5.0F, -6.5F, 3.25F);
		Head.addChild(Head_r14);
		setRotationAngle(Head_r14, 0.0F, -0.5236F, 0.0F);
		Head_r14.setTextureOffset(97, 20).addBox(-2.0F, -1.5F, -1.75F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(-5.51F, -2.5F, -3.25F);
		Head.addChild(Head_r15);
		setRotationAngle(Head_r15, -0.1309F, 0.0F, 0.0F);
		Head_r15.setTextureOffset(77, 17).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r15.setTextureOffset(77, 17).addBox(10.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(-5.51F, -3.5F, -3.25F);
		Head.addChild(Head_r16);
		setRotationAngle(Head_r16, -0.0873F, 0.0F, 0.0F);
		Head_r16.setTextureOffset(77, 20).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r16.setTextureOffset(77, 20).addBox(10.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(-5.51F, -5.0F, -3.25F);
		Head.addChild(Head_r17);
		setRotationAngle(Head_r17, 0.0873F, 0.0F, 0.0F);
		Head_r17.setTextureOffset(77, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r17.setTextureOffset(77, 20).addBox(10.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(-5.51F, -6.5F, -3.25F);
		Head.addChild(Head_r18);
		setRotationAngle(Head_r18, 0.1309F, 0.0F, 0.0F);
		Head_r18.setTextureOffset(77, 17).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r18.setTextureOffset(77, 17).addBox(10.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(96, 110).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 12.0F, 6.0F, 0.0F, false);

		ModelRenderer Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(2.75F, 6.75F, -1.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.5236F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(124, 63).addBox(-2.0F, -2.5F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Body_r1.setTextureOffset(124, 63).addBox(-4.5F, -2.5F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(3.9F, 9.75F, -0.9F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, -0.1309F);
		Body_r2.setTextureOffset(99, 51).addBox(-0.5F, -2.5F, -2.59F, 2.0F, 3.0F, 7.0F, 0.0F, false);

		ModelRenderer Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(-3.9F, 9.75F, -0.9F);
		Body.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 0.0F, 0.1309F);
		Body_r3.setTextureOffset(99, 51).addBox(-1.5F, -2.5F, -2.59F, 2.0F, 3.0F, 7.0F, 0.0F, true);

		ModelRenderer Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 3.75F, -3.0F);
		Body.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.7854F, 0.0F, 0.0F);
		Body_r4.setTextureOffset(108, 62).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);

		ModelRenderer Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(0.0F, 3.8536F, -1.3964F);
		Body.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.6545F, 0.0F, 0.0F);
		Body_r5.setTextureOffset(98, 74).addBox(-4.5F, -3.0F, -3.0F, 9.0F, 6.0F, 6.0F, 0.0F, false);

		ModelRenderer Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(0.0F, 4.3536F, -1.3964F);
		Body.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.9163F, 0.0F, 0.0F);
		Body_r6.setTextureOffset(98, 86).addBox(-4.5F, -3.0F, -3.0F, 9.0F, 6.0F, 6.0F, 0.0F, false);

		ModelRenderer Body_r7 = new ModelRenderer(this);
		Body_r7.setRotationPoint(-0.1F, 3.75F, -1.75F);
		Body.addChild(Body_r7);
		setRotationAngle(Body_r7, 0.7854F, 0.0F, 0.0F);
		Body_r7.setTextureOffset(96, 98).addBox(0.0F, -2.5F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, true);
		Body_r7.setTextureOffset(96, 98).addBox(-4.8F, -2.5F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(114, 58).addBox(-4.25F, -4.5F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(70, 116).addBox(-5.25F, -3.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		RightArm.setTextureOffset(82, 95).addBox(-3.65F, 6.7F, -2.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(82, 95).addBox(-3.65F, 7.95F, -2.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(76, 101).addBox(-3.65F, -2.8F, -2.4F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(80, 74).addBox(-3.65F, 4.2F, -3.4F, 2.0F, 3.0F, 7.0F, 0.0F, false);
		RightArm.setTextureOffset(80, 84).addBox(-4.15F, 3.2F, -2.9F, 3.0F, 5.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(54, 101).addBox(-3.65F, 2.45F, -2.4F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		ModelRenderer RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(-4.65F, -3.4F, 0.15F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.7854F);
		RightArm_r1.setTextureOffset(124, 78).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm_r1.setTextureOffset(124, 78).addBox(0.0F, -0.25F, -0.65F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm_r1.setTextureOffset(124, 78).addBox(0.0F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(-1.15F, 5.7F, 0.1F);
		RightArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 1.5708F, 0.0F);
		RightArm_r2.setTextureOffset(86, 80).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(-7.9549F, -3.5473F, -0.0002F);
		RightArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, 0.5672F);
		RightArm_r3.setTextureOffset(110, 65).addBox(0.1424F, -1.0145F, -0.4998F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setRotationPoint(-7.9549F, -3.5473F, -0.0002F);
		RightArm.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, 0.0F, 0.0F, -1.309F);
		RightArm_r4.setTextureOffset(102, 61).addBox(-2.6586F, 1.432F, -1.0008F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r5 = new ModelRenderer(this);
		RightArm_r5.setRotationPoint(-3.0F, -1.9F, 0.0F);
		RightArm.addChild(RightArm_r5);
		setRotationAngle(RightArm_r5, 0.0F, 0.0F, -0.3491F);
		RightArm_r5.setTextureOffset(69, 117).addBox(-3.0F, -2.0F, -3.499F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		RightArm_r5.setTextureOffset(68, 111).addBox(-3.0F, -2.0F, 1.499F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r6 = new ModelRenderer(this);
		RightArm_r6.setRotationPoint(-7.9549F, -3.5473F, -0.0002F);
		RightArm.addChild(RightArm_r6);
		setRotationAngle(RightArm_r6, 0.0F, 0.0F, -0.6545F);
		RightArm_r6.setTextureOffset(102, 66).addBox(-1.2697F, -3.2128F, -0.9988F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r7 = new ModelRenderer(this);
		RightArm_r7.setRotationPoint(-7.9549F, -3.5473F, -0.0002F);
		RightArm.addChild(RightArm_r7);
		setRotationAngle(RightArm_r7, 0.0F, 0.0F, -0.1745F);
		RightArm_r7.setTextureOffset(108, 62).addBox(-2.562F, -3.2027F, -0.9998F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r8 = new ModelRenderer(this);
		RightArm_r8.setRotationPoint(-7.9549F, -3.5473F, -0.0002F);
		RightArm.addChild(RightArm_r8);
		setRotationAngle(RightArm_r8, 0.0F, 0.0F, -1.1345F);
		RightArm_r8.setTextureOffset(96, 66).addBox(0.7395F, -3.1176F, -1.0008F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(76, 101).addBox(-1.35F, -2.8F, -2.4F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		LeftArm.setTextureOffset(54, 101).addBox(-1.35F, 2.45F, -2.4F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		LeftArm.setTextureOffset(80, 84).addBox(1.15F, 3.2F, -2.9F, 3.0F, 5.0F, 6.0F, 0.0F, true);
		LeftArm.setTextureOffset(80, 74).addBox(1.65F, 4.2F, -3.4F, 2.0F, 3.0F, 7.0F, 0.0F, true);
		LeftArm.setTextureOffset(114, 58).addBox(0.25F, -4.5F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, true);
		LeftArm.setTextureOffset(70, 116).addBox(-0.75F, -3.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.0F, true);
		LeftArm.setTextureOffset(53, 112).addBox(5.6F, 7.6F, -3.4F, 1.0F, 2.0F, 7.0F, 0.0F, true);
		LeftArm.setTextureOffset(80, 64).addBox(5.6F, 1.6F, -3.4F, 1.0F, 3.0F, 7.0F, 0.0F, true);
		LeftArm.setTextureOffset(72, 89).addBox(5.1F, 4.6F, -2.9F, 1.0F, 3.0F, 6.0F, 0.0F, true);
		LeftArm.setTextureOffset(69, 98).addBox(3.85F, 3.85F, -1.9F, 2.0F, 4.0F, 4.0F, 0.0F, true);
		LeftArm.setTextureOffset(62, 116).addBox(5.6F, 6.6F, -3.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(98, 74).addBox(6.1F, 2.1F, -0.9F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(62, 113).addBox(5.6F, 6.6F, 1.6F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftArm.setTextureOffset(82, 95).addBox(-1.65F, 6.7F, -2.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		LeftArm.setTextureOffset(82, 95).addBox(-1.65F, 7.95F, -2.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		ModelRenderer LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(5.9F, 1.933F, 0.1F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 1.309F, 0.0F, -0.0873F);
		LeftArm_r1.setTextureOffset(92, 84).addBox(-0.499F, -2.5909F, -1.7923F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		ModelRenderer LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(5.9F, 1.933F, 0.1F);
		LeftArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, -1.309F, 0.0F, -0.0873F);
		LeftArm_r2.setTextureOffset(92, 84).addBox(-0.5F, -2.5909F, -1.2077F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		ModelRenderer LeftArm_r3 = new ModelRenderer(this);
		LeftArm_r3.setRotationPoint(5.7522F, 11.8013F, -1.4777F);
		LeftArm.addChild(LeftArm_r3);
		setRotationAngle(LeftArm_r3, -0.5236F, 0.0F, 0.0873F);
		LeftArm_r3.setTextureOffset(57, 117).addBox(-0.5012F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftArm_r4 = new ModelRenderer(this);
		LeftArm_r4.setRotationPoint(5.9F, 10.1F, 0.1F);
		LeftArm.addChild(LeftArm_r4);
		setRotationAngle(LeftArm_r4, -1.309F, 0.0F, 0.0873F);
		LeftArm_r4.setTextureOffset(92, 84).addBox(-0.499F, -0.5341F, -2.2588F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		ModelRenderer LeftArm_r5 = new ModelRenderer(this);
		LeftArm_r5.setRotationPoint(5.7512F, 11.8012F, 1.6777F);
		LeftArm.addChild(LeftArm_r5);
		setRotationAngle(LeftArm_r5, 0.5236F, 0.0F, 0.0873F);
		LeftArm_r5.setTextureOffset(57, 117).addBox(-0.5002F, -1.0F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftArm_r6 = new ModelRenderer(this);
		LeftArm_r6.setRotationPoint(5.9F, 10.1F, 0.1F);
		LeftArm.addChild(LeftArm_r6);
		setRotationAngle(LeftArm_r6, 1.309F, 0.0F, 0.0873F);
		LeftArm_r6.setTextureOffset(92, 84).addBox(-0.5F, -0.5341F, -0.7412F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		ModelRenderer LeftArm_r7 = new ModelRenderer(this);
		LeftArm_r7.setRotationPoint(4.65F, -3.4F, 1.85F);
		LeftArm.addChild(LeftArm_r7);
		setRotationAngle(LeftArm_r7, 0.0F, 0.0F, 0.7854F);
		LeftArm_r7.setTextureOffset(124, 78).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm_r7.setTextureOffset(124, 78).addBox(-1.0F, -0.5F, -3.2F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		LeftArm_r7.setTextureOffset(124, 78).addBox(-1.0F, -0.25F, -2.35F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftArm_r8 = new ModelRenderer(this);
		LeftArm_r8.setRotationPoint(7.9549F, -3.5473F, -0.0002F);
		LeftArm.addChild(LeftArm_r8);
		setRotationAngle(LeftArm_r8, 0.0F, 0.0F, 1.1345F);
		LeftArm_r8.setTextureOffset(96, 66).addBox(-1.7395F, -3.1176F, -1.0008F, 1.0F, 6.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftArm_r9 = new ModelRenderer(this);
		LeftArm_r9.setRotationPoint(7.9549F, -3.5473F, -0.0002F);
		LeftArm.addChild(LeftArm_r9);
		setRotationAngle(LeftArm_r9, 0.0F, 0.0F, 1.309F);
		LeftArm_r9.setTextureOffset(102, 61).addBox(1.6586F, 1.432F, -1.0008F, 1.0F, 3.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftArm_r10 = new ModelRenderer(this);
		LeftArm_r10.setRotationPoint(7.9549F, -3.5473F, -0.0002F);
		LeftArm.addChild(LeftArm_r10);
		setRotationAngle(LeftArm_r10, 0.0F, 0.0F, 0.6545F);
		LeftArm_r10.setTextureOffset(102, 66).addBox(0.2697F, -3.2128F, -0.9988F, 1.0F, 6.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftArm_r11 = new ModelRenderer(this);
		LeftArm_r11.setRotationPoint(7.9549F, -3.5473F, -0.0002F);
		LeftArm.addChild(LeftArm_r11);
		setRotationAngle(LeftArm_r11, 0.0F, 0.0F, -0.5672F);
		LeftArm_r11.setTextureOffset(110, 65).addBox(-1.1424F, -1.0145F, -0.4998F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftArm_r12 = new ModelRenderer(this);
		LeftArm_r12.setRotationPoint(7.9549F, -3.5473F, -0.0002F);
		LeftArm.addChild(LeftArm_r12);
		setRotationAngle(LeftArm_r12, 0.0F, 0.0F, 0.1745F);
		LeftArm_r12.setTextureOffset(108, 62).addBox(1.562F, -3.2027F, -0.9998F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftArm_r13 = new ModelRenderer(this);
		LeftArm_r13.setRotationPoint(3.0F, -1.9F, 0.0F);
		LeftArm.addChild(LeftArm_r13);
		setRotationAngle(LeftArm_r13, 0.0F, 0.0F, 0.3491F);
		LeftArm_r13.setTextureOffset(69, 117).addBox(1.0F, -2.0F, -3.499F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		LeftArm_r13.setTextureOffset(68, 111).addBox(1.0F, -2.0F, 1.499F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(6, 85).addBox(-5.5F, 10.0F, -3.5F, 11.0F, 2.0F, 7.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 108).addBox(-3.0F, -1.0F, -2.99F, 5.0F, 12.0F, 6.0F, 0.0F, false);
		RightLeg.setTextureOffset(22, 118).addBox(-4.0F, -1.0F, -3.99F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		RightLeg.setTextureOffset(22, 108).addBox(-3.25F, 1.0F, -3.99F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 98).addBox(-2.5F, 3.0F, -3.99F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		RightLeg.setTextureOffset(14, 97).addBox(-5.75F, -1.25F, -1.99F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(7, 87).addBox(-5.0F, 1.75F, -1.99F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(7, 85).addBox(-5.0F, -2.25F, -1.99F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(7, 89).addBox(-5.0F, 1.75F, 1.01F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(1, 85).addBox(-5.0F, -2.25F, 1.01F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 102).addBox(-5.65F, 1.25F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 102).addBox(-5.65F, -1.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 99).addBox(-4.25F, 1.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 99).addBox(-4.25F, -2.25F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 96).addBox(-4.25F, 4.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 90).addBox(-4.25F, 2.75F, -1.99F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		ModelRenderer RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(-0.65F, 6.4286F, 3.423F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.9599F, 0.0F, 0.0F);
		RightLeg_r1.setTextureOffset(0, 110).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(-1.15F, 5.5F, -3.04F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.6981F, 0.0F, 0.0F);
		RightLeg_r2.setTextureOffset(22, 104).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		ModelRenderer RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(-0.65F, 5.75F, -2.79F);
		RightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.5672F, 0.0F, 0.0F);
		RightLeg_r3.setTextureOffset(16, 109).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 108).addBox(-2.0F, -1.0F, -2.99F, 5.0F, 12.0F, 6.0F, 0.0F, true);
		LeftLeg.setTextureOffset(22, 118).addBox(-1.0F, -1.0F, -3.99F, 5.0F, 2.0F, 8.0F, 0.0F, true);
		LeftLeg.setTextureOffset(22, 108).addBox(-0.75F, 1.0F, -3.99F, 4.0F, 2.0F, 8.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 98).addBox(-0.5F, 3.0F, -3.99F, 3.0F, 2.0F, 8.0F, 0.0F, true);
		LeftLeg.setTextureOffset(14, 97).addBox(2.75F, -1.25F, -1.99F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(7, 87).addBox(3.0F, 1.75F, -1.99F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(7, 85).addBox(3.0F, -2.25F, -1.99F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(7, 89).addBox(3.0F, 1.75F, 1.01F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(1, 85).addBox(3.0F, -2.25F, 1.01F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 102).addBox(4.65F, 1.25F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 102).addBox(4.65F, -1.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 99).addBox(3.25F, 1.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 99).addBox(3.25F, -2.25F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 96).addBox(3.25F, 4.75F, -0.99F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 90).addBox(3.25F, 2.75F, -1.99F, 1.0F, 2.0F, 4.0F, 0.0F, true);

		ModelRenderer LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setRotationPoint(0.65F, 6.4286F, 3.423F);
		LeftLeg.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 0.9599F, 0.0F, 0.0F);
		LeftLeg_r1.setTextureOffset(0, 110).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftLeg_r2 = new ModelRenderer(this);
		LeftLeg_r2.setRotationPoint(1.15F, 5.5F, -3.04F);
		LeftLeg.addChild(LeftLeg_r2);
		setRotationAngle(LeftLeg_r2, 0.6981F, 0.0F, 0.0F);
		LeftLeg_r2.setTextureOffset(22, 104).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftLeg_r3 = new ModelRenderer(this);
		LeftLeg_r3.setRotationPoint(0.65F, 5.75F, -2.79F);
		LeftLeg.addChild(LeftLeg_r3);
		setRotationAngle(LeftLeg_r3, 0.5672F, 0.0F, 0.0F);
		LeftLeg_r3.setTextureOffset(16, 109).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, true);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 11.0F, 0.0F);
		RightBoot.setTextureOffset(0, 0).addBox(-3.478F, 9.16F, -3.54F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		RightBoot.setTextureOffset(19, 0).addBox(-3.578F, 12.5779F, -6.5647F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		RightBoot.setTextureOffset(20, 38).addBox(-3.578F, 11.5779F, 2.8147F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer RightBoot_r1 = new ModelRenderer(this);
		RightBoot_r1.setRotationPoint(2.5F, 13.95F, 3.0F);
		RightBoot.addChild(RightBoot_r1);
		setRotationAngle(RightBoot_r1, 0.829F, 0.0F, 0.0F);
		RightBoot_r1.setTextureOffset(0, 27).addBox(-5.878F, -3.34F, 1.04F, 6.0F, 3.0F, 2.0F, 0.0F, false);

		ModelRenderer RightBoot_r2 = new ModelRenderer(this);
		RightBoot_r2.setRotationPoint(2.5F, 15.4F, -6.3F);
		RightBoot.addChild(RightBoot_r2);
		setRotationAngle(RightBoot_r2, -0.7854F, 0.0F, 0.0F);
		RightBoot_r2.setTextureOffset(0, 25).addBox(-5.878F, -2.74F, -2.04F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightBoot_r3 = new ModelRenderer(this);
		RightBoot_r3.setRotationPoint(2.5F, 14.4F, -5.3F);
		RightBoot.addChild(RightBoot_r3);
		setRotationAngle(RightBoot_r3, -0.7854F, 0.0F, 0.0F);
		RightBoot_r3.setTextureOffset(0, 22).addBox(-5.878F, -2.34F, -2.04F, 6.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightBoot_r4 = new ModelRenderer(this);
		RightBoot_r4.setRotationPoint(0.122F, 11.1215F, -2.9338F);
		RightBoot.addChild(RightBoot_r4);
		setRotationAngle(RightBoot_r4, -0.3927F, 0.0F, 0.0F);
		RightBoot_r4.setTextureOffset(13, 12).addBox(-4.0F, -2.5F, -1.75F, 7.0F, 2.0F, 5.0F, 0.0F, false);

		ModelRenderer RightBoot_r5 = new ModelRenderer(this);
		RightBoot_r5.setRotationPoint(-0.378F, 11.2715F, -2.9838F);
		RightBoot.addChild(RightBoot_r5);
		setRotationAngle(RightBoot_r5, -0.7854F, 0.0F, 0.0F);
		RightBoot_r5.setTextureOffset(0, 11).addBox(-3.0F, -1.5F, -1.4662F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 11.0F, 0.0F);
		LeftBoot.setTextureOffset(0, 0).addBox(-2.522F, 9.16F, -3.54F, 6.0F, 4.0F, 7.0F, 0.0F, true);
		LeftBoot.setTextureOffset(19, 0).addBox(-2.422F, 12.5779F, -6.5647F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		LeftBoot.setTextureOffset(20, 38).addBox(-2.422F, 11.5779F, 2.8147F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftBoot_r1 = new ModelRenderer(this);
		LeftBoot_r1.setRotationPoint(-2.5F, 13.95F, 3.0F);
		LeftBoot.addChild(LeftBoot_r1);
		setRotationAngle(LeftBoot_r1, 0.829F, 0.0F, 0.0F);
		LeftBoot_r1.setTextureOffset(0, 27).addBox(-0.122F, -3.34F, 1.04F, 6.0F, 3.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftBoot_r2 = new ModelRenderer(this);
		LeftBoot_r2.setRotationPoint(-2.5F, 15.4F, -6.3F);
		LeftBoot.addChild(LeftBoot_r2);
		setRotationAngle(LeftBoot_r2, -0.7854F, 0.0F, 0.0F);
		LeftBoot_r2.setTextureOffset(0, 25).addBox(-0.122F, -2.74F, -2.04F, 6.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LeftBoot_r3 = new ModelRenderer(this);
		LeftBoot_r3.setRotationPoint(-2.5F, 14.4F, -5.3F);
		LeftBoot.addChild(LeftBoot_r3);
		setRotationAngle(LeftBoot_r3, -0.7854F, 0.0F, 0.0F);
		LeftBoot_r3.setTextureOffset(0, 22).addBox(-0.122F, -2.34F, -2.04F, 6.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer LeftBoot_r4 = new ModelRenderer(this);
		LeftBoot_r4.setRotationPoint(-0.122F, 11.1215F, -2.9338F);
		LeftBoot.addChild(LeftBoot_r4);
		setRotationAngle(LeftBoot_r4, -0.3927F, 0.0F, 0.0F);
		LeftBoot_r4.setTextureOffset(13, 12).addBox(-3.0F, -2.5F, -1.75F, 7.0F, 2.0F, 5.0F, 0.0F, true);

		ModelRenderer LeftBoot_r5 = new ModelRenderer(this);
		LeftBoot_r5.setRotationPoint(0.378F, 11.2715F, -2.9838F);
		LeftBoot.addChild(LeftBoot_r5);
		setRotationAngle(LeftBoot_r5, -0.7854F, 0.0F, 0.0F);
		LeftBoot_r5.setTextureOffset(0, 11).addBox(-3.0F, -1.5F, -1.4662F, 6.0F, 3.0F, 3.0F, 0.0F, true);
		
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}