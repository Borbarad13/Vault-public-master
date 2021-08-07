package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class OrcArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

    public OrcArmorModel(float modelSize, EquipmentSlotType slotType) {
        super(modelSize, slotType);

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -8.5F, -5.0F, 10.0F, 9.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(5.0F, -5.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 19).addBox(-5.5F, -7.5F, -4.0F, 11.0F, 7.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 19).addBox(6.0F, -5.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 19).addBox(-8.0F, -5.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 0).addBox(-6.0F, -5.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		Head.setTextureOffset(0, 34).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		ModelRenderer Head_r10_r1 = new ModelRenderer(this);
		Head_r10_r1.setRotationPoint(0.0F, 7.0153F, 33.4193F);
		Head.addChild(Head_r10_r1);
		setRotationAngle(Head_r10_r1, 1.1781F, 0.0F, 0.0F);
		Head_r10_r1.setTextureOffset(36, 0).addBox(-5.0F, -33.75F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r9_r1 = new ModelRenderer(this);
		Head_r9_r1.setRotationPoint(1.5915F, 2.639F, 35.8093F);
		Head.addChild(Head_r9_r1);
		setRotationAngle(Head_r9_r1, 1.2859F, -0.274F, -0.7459F);
		Head_r9_r1.setTextureOffset(30, 6).addBox(-6.75F, -34.382F, 2.5714F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r8_r1 = new ModelRenderer(this);
		Head_r8_r1.setRotationPoint(4.5207F, 9.1721F, 33.1034F);
		Head.addChild(Head_r8_r1);
		setRotationAngle(Head_r8_r1, 1.2859F, -0.274F, -0.7459F);
		Head_r8_r1.setTextureOffset(30, 6).addBox(3.25F, -34.382F, 2.5714F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r7_r1 = new ModelRenderer(this);
		Head_r7_r1.setRotationPoint(0.0F, 8.3574F, -28.8643F);
		Head.addChild(Head_r7_r1);
		setRotationAngle(Head_r7_r1, -1.0472F, 0.0F, 0.0F);
		Head_r7_r1.setTextureOffset(0, 5).addBox(-0.4797F, -30.7025F, -3.8183F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r8_r2 = new ModelRenderer(this);
		Head_r8_r2.setRotationPoint(-2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r8_r2);
		setRotationAngle(Head_r8_r2, -1.0472F, 0.0F, -0.5672F);
		Head_r8_r2.setTextureOffset(0, 5).addBox(-2.0337F, 2.7133F, -3.6233F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r9_r2 = new ModelRenderer(this);
		Head_r9_r2.setRotationPoint(2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r9_r2);
		setRotationAngle(Head_r9_r2, -1.0472F, 0.0F, 0.5672F);
		Head_r9_r2.setTextureOffset(0, 5).addBox(1.0337F, 2.7133F, -3.6233F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r6_r1 = new ModelRenderer(this);
		Head_r6_r1.setRotationPoint(0.0F, -0.85F, -32.734F);
		Head.addChild(Head_r6_r1);
		setRotationAngle(Head_r6_r1, -1.3526F, 0.0F, 0.0F);
		Head_r6_r1.setTextureOffset(0, 5).addBox(-0.4797F, -32.1886F, -3.4817F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r7_r2 = new ModelRenderer(this);
		Head_r7_r2.setRotationPoint(-2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r7_r2);
		setRotationAngle(Head_r7_r2, -1.3526F, 0.0F, -0.5672F);
		Head_r7_r2.setTextureOffset(0, 5).addBox(-2.0337F, 1.4071F, -3.0752F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r8_r3 = new ModelRenderer(this);
		Head_r8_r3.setRotationPoint(2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r8_r3);
		setRotationAngle(Head_r8_r3, -1.3526F, 0.0F, 0.5672F);
		Head_r8_r3.setTextureOffset(0, 5).addBox(1.0337F, 1.4071F, -3.0752F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r5_r1 = new ModelRenderer(this);
		Head_r5_r1.setRotationPoint(0.0F, -0.85F, 32.734F);
		Head.addChild(Head_r5_r1);
		setRotationAngle(Head_r5_r1, 1.3526F, 0.0F, 0.0F);
		Head_r5_r1.setTextureOffset(0, 5).addBox(-0.4797F, -32.1886F, -0.5183F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r6_r2 = new ModelRenderer(this);
		Head_r6_r2.setRotationPoint(-2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r6_r2);
		setRotationAngle(Head_r6_r2, 1.3526F, 0.0F, -0.5672F);
		Head_r6_r2.setTextureOffset(0, 5).addBox(-2.0337F, 1.4518F, -0.9149F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r7_r3 = new ModelRenderer(this);
		Head_r7_r3.setRotationPoint(2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r7_r3);
		setRotationAngle(Head_r7_r3, 1.3526F, 0.0F, 0.5672F);
		Head_r7_r3.setTextureOffset(0, 5).addBox(1.0337F, 1.4518F, -0.9149F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r4_r1 = new ModelRenderer(this);
		Head_r4_r1.setRotationPoint(0.0F, 8.3574F, 28.8643F);
		Head.addChild(Head_r4_r1);
		setRotationAngle(Head_r4_r1, 1.0472F, 0.0F, 0.0F);
		Head_r4_r1.setTextureOffset(0, 5).addBox(-0.4797F, -30.7025F, -0.1817F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r5_r2 = new ModelRenderer(this);
		Head_r5_r2.setRotationPoint(-2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r5_r2);
		setRotationAngle(Head_r5_r2, 1.0472F, 0.0F, -0.5672F);
		Head_r5_r2.setTextureOffset(0, 5).addBox(-2.0337F, 2.753F, -0.3538F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r6_r3 = new ModelRenderer(this);
		Head_r6_r3.setRotationPoint(2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r6_r3);
		setRotationAngle(Head_r6_r3, 1.0472F, 0.0F, 0.5672F);
		Head_r6_r3.setTextureOffset(0, 5).addBox(1.0337F, 2.753F, -0.3538F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r3_r1 = new ModelRenderer(this);
		Head_r3_r1.setRotationPoint(-14.9551F, -18.0441F, -18.5235F);
		Head.addChild(Head_r3_r1);
		setRotationAngle(Head_r3_r1, -0.7516F, 0.05F, 2.7519F);
		Head_r3_r1.setTextureOffset(66, 19).addBox(-4.5449F, -26.0559F, -6.9807F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r3_r2 = new ModelRenderer(this);
		Head_r3_r2.setRotationPoint(-14.9551F, -18.2941F, -18.7735F);
		Head.addChild(Head_r3_r2);
		setRotationAngle(Head_r3_r2, -0.7516F, 0.05F, 2.7519F);
		Head_r3_r2.setTextureOffset(70, 16).addBox(-4.4797F, -26.4262F, -4.9807F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		ModelRenderer Head_r2_r1 = new ModelRenderer(this);
		Head_r2_r1.setRotationPoint(14.9551F, -18.2941F, -18.7735F);
		Head.addChild(Head_r2_r1);
		setRotationAngle(Head_r2_r1, -0.7516F, -0.05F, -2.7519F);
		Head_r2_r1.setTextureOffset(70, 16).addBox(3.4797F, -26.4262F, -4.9807F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		ModelRenderer Head_r2_r2 = new ModelRenderer(this);
		Head_r2_r2.setRotationPoint(14.9551F, -18.0441F, -18.5235F);
		Head.addChild(Head_r2_r2);
		setRotationAngle(Head_r2_r2, -0.7516F, -0.05F, -2.7519F);
		Head_r2_r2.setTextureOffset(66, 19).addBox(3.5449F, -26.0559F, -6.9807F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer Head_r1_r1 = new ModelRenderer(this);
		Head_r1_r1.setRotationPoint(0.0F, -7.9333F, 33.7038F);
		Head.addChild(Head_r1_r1);
		setRotationAngle(Head_r1_r1, 1.5708F, 0.0F, 0.0F);
		Head_r1_r1.setTextureOffset(0, 5).addBox(-0.4797F, -34.3185F, -0.3647F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head_r1_r1.setTextureOffset(0, 52).addBox(-0.9797F, -38.3185F, -0.3647F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r3_r3 = new ModelRenderer(this);
		Head_r3_r3.setRotationPoint(5.0203F, -8.5685F, -0.1147F);
		Head.addChild(Head_r3_r3);
		setRotationAngle(Head_r3_r3, 1.5708F, 0.0F, 0.5672F);
		Head_r3_r3.setTextureOffset(0, 52).addBox(-1.0F, -4.5F, -1.75F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		ModelRenderer Head_r4_r2 = new ModelRenderer(this);
		Head_r4_r2.setRotationPoint(-5.0203F, -8.5685F, -0.1147F);
		Head.addChild(Head_r4_r2);
		setRotationAngle(Head_r4_r2, 1.5708F, 0.0F, -0.5672F);
		Head_r4_r2.setTextureOffset(0, 52).addBox(-1.0F, -4.5F, -1.75F, 2.0F, 9.0F, 2.0F, 0.0F, true);

		ModelRenderer Head_r2_r3 = new ModelRenderer(this);
		Head_r2_r3.setRotationPoint(-2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r2_r3);
		setRotationAngle(Head_r2_r3, 1.5708F, 0.0F, -0.5672F);
		Head_r2_r3.setTextureOffset(0, 5).addBox(-2.0337F, -0.5918F, -0.9508F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r3_r4 = new ModelRenderer(this);
		Head_r3_r4.setRotationPoint(2.9797F, -8.4036F, -0.0229F);
		Head.addChild(Head_r3_r4);
		setRotationAngle(Head_r3_r4, 1.5708F, 0.0F, 0.5672F);
		Head_r3_r4.setTextureOffset(0, 5).addBox(1.0337F, -0.5918F, -0.9508F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(42, 32).addBox(-5.0F, 9.55F, -3.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(42, 32).addBox(-5.0F, 10.55F, -3.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(6.731F, 30.731F, 0.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 0.0F, -0.7854F);
		Body_r1.setTextureOffset(84, 0).addBox(7.4905F, -22.0095F, 1.95F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body_r1.setTextureOffset(84, 0).addBox(7.4905F, -22.0095F, -2.95F, 8.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(-1.005F, 26.4263F, 0.0F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, 0.3927F);
		Body_r2.setTextureOffset(78, 3).addBox(-13.6013F, -22.5631F, 1.96F, 11.0F, 2.0F, 1.0F, 0.0F, false);
		Body_r2.setTextureOffset(78, 3).addBox(-13.6013F, -22.5631F, -2.96F, 11.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(3.0F, 24.0F, -9.7962F);
		Body.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, -1.5708F, 0.0F);
		Body_r3.setTextureOffset(69, 0).addBox(6.7962F, -19.5216F, -2.3981F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(2.5F, 4.6818F, -3.3418F);
		Body.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 0.0F, -1.1781F);
		Body_r4.setTextureOffset(56, 3).addBox(-1.5F, -1.5F, 0.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);


		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(102, 34).addBox(-5.5F, -3.5F, -3.5F, 6.0F, 6.0F, 7.0F, 0.0F, false);
		RightArm.setTextureOffset(106, 22).addBox(-4.5F, -2.5F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(88, 41).addBox(-4.0F, 4.75F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(100, 47).addBox(-5.94F, -4.14F, -3.99F, 6.0F, 6.0F, 8.0F, 0.0F, true);

		ModelRenderer RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(-3.75F, 10.75F, -4.0F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.7854F);
		RightArm_r1.setTextureOffset(104, 53).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm_r1.setTextureOffset(104, 53).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm_r1.setTextureOffset(104, 53).addBox(-0.5F, -0.5F, 5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r16_r1 = new ModelRenderer(this);
		RightArm_r16_r1.setRotationPoint(-15.6819F, 21.1953F, 0.0F);
		RightArm.addChild(RightArm_r16_r1);
		setRotationAngle(RightArm_r16_r1, 0.0F, 0.0F, 0.7854F);
		RightArm_r16_r1.setTextureOffset(59, 3).addBox(-11.266F, -27.1605F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		RightArm_r16_r1.setTextureOffset(77, 6).addBox(-11.766F, -26.6605F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		RightArm_r16_r1.setTextureOffset(45, 3).addBox(-10.916F, -27.6605F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		ModelRenderer RightArm_r15_r1 = new ModelRenderer(this);
		RightArm_r15_r1.setRotationPoint(-9.8972F, 11.8447F, 24.2772F);
		RightArm.addChild(RightArm_r15_r1);
		setRotationAngle(RightArm_r15_r1, 0.9228F, -0.3331F, 0.4321F);
		RightArm_r15_r1.setTextureOffset(88, 7).addBox(-10.2553F, -28.1889F, 0.7807F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r16_r2 = new ModelRenderer(this);
		RightArm_r16_r2.setRotationPoint(-9.8972F, 11.8447F, -24.2772F);
		RightArm.addChild(RightArm_r16_r2);
		setRotationAngle(RightArm_r16_r2, -0.9228F, 0.3331F, 0.4321F);
		RightArm_r16_r2.setTextureOffset(88, 7).addBox(-10.2553F, -28.1889F, -2.7807F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r14_r1 = new ModelRenderer(this);
		RightArm_r14_r1.setRotationPoint(-26.2895F, -0.5526F, 20.4602F);
		RightArm.addChild(RightArm_r14_r1);
		setRotationAngle(RightArm_r14_r1, 0.8986F, 0.3292F, 1.8908F);
		RightArm_r14_r1.setTextureOffset(90, 11).addBox(-6.8397F, -29.2319F, 2.2748F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r15_r2 = new ModelRenderer(this);
		RightArm_r15_r2.setRotationPoint(-26.2895F, -0.5526F, -20.4602F);
		RightArm.addChild(RightArm_r15_r2);
		setRotationAngle(RightArm_r15_r2, -0.8986F, -0.3292F, 1.8908F);
		RightArm_r15_r2.setTextureOffset(90, 11).addBox(-6.8397F, -29.2319F, -4.2748F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r13_r1 = new ModelRenderer(this);
		RightArm_r13_r1.setRotationPoint(-20.8261F, -23.7685F, 1.3152F);
		RightArm.addChild(RightArm_r13_r1);
		setRotationAngle(RightArm_r13_r1, 1.3384F, 1.3947F, -2.7044F);
		RightArm_r13_r1.setTextureOffset(90, 11).addBox(-7.8641F, -26.4101F, 3.8227F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r14_r2 = new ModelRenderer(this);
		RightArm_r14_r2.setRotationPoint(-20.8261F, -23.7685F, -1.3152F);
		RightArm.addChild(RightArm_r14_r2);
		setRotationAngle(RightArm_r14_r2, -1.3384F, -1.3947F, -2.7044F);
		RightArm_r14_r2.setTextureOffset(90, 11).addBox(-7.8641F, -26.4101F, -5.8227F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r12_r1 = new ModelRenderer(this);
		RightArm_r12_r1.setRotationPoint(-12.3708F, -27.574F, 4.4556F);
		RightArm.addChild(RightArm_r12_r1);
		setRotationAngle(RightArm_r12_r1, 2.3707F, 1.1811F, -1.3326F);
		RightArm_r12_r1.setTextureOffset(90, 11).addBox(-8.7903F, -25.2317F, 4.1332F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r13_r2 = new ModelRenderer(this);
		RightArm_r13_r2.setRotationPoint(-4.7492F, -1.8911F, 3.9063F);
		RightArm.addChild(RightArm_r13_r2);
		setRotationAngle(RightArm_r13_r2, 2.7296F, 0.8486F, -0.9174F);
		RightArm_r13_r2.setTextureOffset(86, 12).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r13_r3 = new ModelRenderer(this);
		RightArm_r13_r3.setRotationPoint(-12.3708F, -27.574F, -4.4556F);
		RightArm.addChild(RightArm_r13_r3);
		setRotationAngle(RightArm_r13_r3, -2.3707F, -1.1811F, -1.3326F);
		RightArm_r13_r3.setTextureOffset(90, 11).addBox(-8.7903F, -25.2317F, -6.1332F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r14_r3 = new ModelRenderer(this);
		RightArm_r14_r3.setRotationPoint(-4.7492F, -1.8911F, -3.9063F);
		RightArm.addChild(RightArm_r14_r3);
		setRotationAngle(RightArm_r14_r3, -2.7296F, -0.8486F, -0.9174F);
		RightArm_r14_r3.setTextureOffset(86, 12).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r11_r1 = new ModelRenderer(this);
		RightArm_r11_r1.setRotationPoint(-30.3504F, -11.0402F, 7.8718F);
		RightArm.addChild(RightArm_r11_r1);
		setRotationAngle(RightArm_r11_r1, 0.8177F, 0.9419F, 2.4841F);
		RightArm_r11_r1.setTextureOffset(90, 11).addBox(-8.0975F, -28.0785F, 3.3265F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r12_r2 = new ModelRenderer(this);
		RightArm_r12_r2.setRotationPoint(-30.3504F, -11.0402F, -7.8718F);
		RightArm.addChild(RightArm_r12_r2);
		setRotationAngle(RightArm_r12_r2, -0.8177F, -0.9419F, 2.4841F);
		RightArm_r12_r2.setTextureOffset(90, 11).addBox(-8.0975F, -28.0785F, -5.3265F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r10_r1 = new ModelRenderer(this);
		RightArm_r10_r1.setRotationPoint(-14.0941F, -25.9779F, -12.4426F);
		RightArm.addChild(RightArm_r10_r1);
		setRotationAngle(RightArm_r10_r1, -0.6926F, -0.3885F, -3.0124F);
		RightArm_r10_r1.setTextureOffset(86, 12).addBox(-7.5757F, -27.9828F, 3.1884F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r11_r2 = new ModelRenderer(this);
		RightArm_r11_r2.setRotationPoint(-14.0941F, -25.9779F, 12.4426F);
		RightArm.addChild(RightArm_r11_r2);
		setRotationAngle(RightArm_r11_r2, 0.6926F, 0.3885F, -3.0124F);
		RightArm_r11_r2.setTextureOffset(86, 12).addBox(-7.5757F, -27.9828F, -4.1884F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RightArm_r9_r1 = new ModelRenderer(this);
		RightArm_r9_r1.setRotationPoint(-16.7686F, 4.7281F, 28.1131F);
		RightArm.addChild(RightArm_r9_r1);
		setRotationAngle(RightArm_r9_r1, 1.0768F, -0.1771F, 1.1228F);
		RightArm_r9_r1.setTextureOffset(83, 14).addBox(-9.2303F, -29.9571F, 1.504F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm_r9_r1.setTextureOffset(83, 14).addBox(-8.9803F, -29.7071F, 1.754F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r10_r2 = new ModelRenderer(this);
		RightArm_r10_r2.setRotationPoint(-16.7686F, 4.7281F, -28.1131F);
		RightArm.addChild(RightArm_r10_r2);
		setRotationAngle(RightArm_r10_r2, -1.0768F, 0.1771F, 1.1228F);
		RightArm_r10_r2.setTextureOffset(83, 14).addBox(-9.2303F, -29.9571F, -3.504F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm_r10_r2.setTextureOffset(83, 14).addBox(-8.9803F, -29.7071F, -3.754F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer RightArm_r1_r1 = new ModelRenderer(this);
		RightArm_r1_r1.setRotationPoint(-1.5988F, 23.9334F, 0.0F);
		RightArm.addChild(RightArm_r1_r1);
		setRotationAngle(RightArm_r1_r1, 0.0F, 0.0F, 0.2618F);
		

		ModelRenderer RightArm_r2_r2_r1 = new ModelRenderer(this);
		RightArm_r2_r2_r1.setRotationPoint(-11.1969F, -21.5212F, 0.0F);
		RightArm_r1_r1.addChild(RightArm_r2_r2_r1);
		setRotationAngle(RightArm_r2_r2_r1, 3.1416F, 0.0F, -0.5236F);
		RightArm_r2_r2_r1.setTextureOffset(86, 14).addBox(-0.25F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer RightArm_r1_r1_r1 = new ModelRenderer(this);
		RightArm_r1_r1_r1.setRotationPoint(-9.3398F, -22.5057F, 0.0F);
		RightArm_r1_r1.addChild(RightArm_r1_r1_r1);
		setRotationAngle(RightArm_r1_r1_r1, 0.0F, 0.0F, 0.3491F);
		RightArm_r1_r1_r1.setTextureOffset(86, 14).addBox(-3.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(82, 22).addBox(-1.0F, 9.4318F, -4.3418F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(79, 20).addBox(-0.5F, 10.9318F, -4.0918F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(80, 26).addBox(-1.5F, 8.75F, 2.1F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(80, 26).addBox(-1.5F, 8.75F, -3.1F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(51, 22).addBox(-5.5F, 10.5F, -3.5F, 11.0F, 2.0F, 7.0F, 0.0F, false);
		Belt.setTextureOffset(42, 18).addBox(-5.75F, 13.25F, -3.5F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		Belt.setTextureOffset(42, 18).addBox(4.75F, 13.25F, -3.5F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		Belt.setTextureOffset(30, 19).addBox(-5.5F, 16.5F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, true);
		Belt.setTextureOffset(30, 19).addBox(4.5F, 16.5F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		Belt.setTextureOffset(30, 26).addBox(-6.0F, 11.25F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, true);
		Belt.setTextureOffset(30, 26).addBox(5.0F, 11.25F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		Belt.setTextureOffset(42, 32).addBox(-5.0F, 10.55F, -3.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer Belt_r1 = new ModelRenderer(this);
		Belt_r1.setRotationPoint(-1.8827F, 10.6057F, -3.3418F);
		Belt.addChild(Belt_r1);
		setRotationAngle(Belt_r1, 0.6545F, 0.0F, -1.1781F);
		Belt_r1.setTextureOffset(87, 20).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Belt_r2 = new ModelRenderer(this);
		Belt_r2.setRotationPoint(-1.7691F, 11.6253F, -3.1418F);
		Belt.addChild(Belt_r2);
		setRotationAngle(Belt_r2, -0.7854F, 0.0F, -2.0508F);
		Belt_r2.setTextureOffset(83, 20).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Belt_r3 = new ModelRenderer(this);
		Belt_r3.setRotationPoint(1.8827F, 10.6057F, -3.3418F);
		Belt.addChild(Belt_r3);
		setRotationAngle(Belt_r3, 1.0472F, 0.0F, 1.1781F);
		Belt_r3.setTextureOffset(87, 20).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Belt_r4 = new ModelRenderer(this);
		Belt_r4.setRotationPoint(1.7691F, 11.6253F, -3.1418F);
		Belt.addChild(Belt_r4);
		setRotationAngle(Belt_r4, -0.7854F, 0.0F, 2.0508F);
		Belt_r4.setTextureOffset(83, 20).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Belt_r5 = new ModelRenderer(this);
		Belt_r5.setRotationPoint(-0.5983F, 25.6438F, 0.0F);
		Belt.addChild(Belt_r5);
		setRotationAngle(Belt_r5, 0.0F, 0.0F, 0.3491F);
		Belt_r5.setTextureOffset(27, 38).addBox(-4.4598F, -16.3746F, 1.91F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		Belt_r5.setTextureOffset(27, 38).addBox(-4.4598F, -16.3746F, -2.89F, 5.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer Belt_r6 = new ModelRenderer(this);
		Belt_r6.setRotationPoint(0.5983F, 25.6438F, 0.0F);
		Belt.addChild(Belt_r6);
		setRotationAngle(Belt_r6, 0.0F, 0.0F, -0.3491F);
		Belt_r6.setTextureOffset(27, 38).addBox(-0.5402F, -16.3746F, 1.91F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Belt_r6.setTextureOffset(27, 38).addBox(-0.5402F, -16.3746F, -2.89F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer Belt_r7 = new ModelRenderer(this);
		Belt_r7.setRotationPoint(0.0F, 10.1818F, -3.5918F);
		Belt.addChild(Belt_r7);
		setRotationAngle(Belt_r7, -0.7854F, 0.0F, 0.0F);
		Belt_r7.setTextureOffset(83, 18).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(8, 52).addBox(-3.0F, -1.0F, -2.99F, 5.0F, 6.0F, 6.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(8, 64).addBox(-2.0F, -1.0F, -2.99F, 5.0F, 6.0F, 6.0F, 0.0F, true);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftBoot.setTextureOffset(29, 116).addBox(-3.122F, 8.34F, -3.54F, 6.0F, 4.0F, 7.0F, 0.0F, true);
		LeftBoot.setTextureOffset(33, 94).addBox(-2.5307F, 9.3F, -4.5718F, 5.0F, 3.0F, 2.0F, 0.0F, true);
		LeftBoot.setTextureOffset(34, 99).addBox(-2.0307F, 10.425F, -5.0718F, 4.0F, 2.0F, 2.0F, 0.0F, true);
		LeftBoot.setTextureOffset(29, 103).addBox(-2.4F, 5.5F, -2.99F, 5.0F, 7.0F, 6.0F, 0.0F, true);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightBoot.setTextureOffset(29, 116).addBox(-2.878F, 8.34F, -3.54F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		RightBoot.setTextureOffset(33, 94).addBox(-2.4693F, 9.3F, -4.5718F, 5.0F, 3.0F, 2.0F, 0.0F, false);
		RightBoot.setTextureOffset(34, 99).addBox(-1.9693F, 10.425F, -5.0718F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		RightBoot.setTextureOffset(29, 103).addBox(-2.4F, 5.5F, -2.99F, 5.0F, 7.0F, 6.0F, 0.0F, false);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}