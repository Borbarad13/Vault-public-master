package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class LightArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

    public LightArmorModel(float modelSize, EquipmentSlotType slotType) {
        super(modelSize, slotType);
        textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-0.5236F, -11.25F, 0.2686F);
		

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(2.5842F, -0.25F, 4.6901F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, -1.1345F, 0.0F);
		Head_r1.setTextureOffset(50, 16).addBox(-0.5F, -10.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(5.0236F, -0.25F, -2.5186F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.4363F, 0.0F);
		Head_r2.setTextureOffset(50, 16).addBox(-0.5F, -10.5F, -1.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.5318F, 0.25F, -0.013F);
		Head.addChild(Head_r3);
		setRotationAngle(Head_r3, -3.1416F, -1.1345F, 3.1416F);
		Head_r3.setTextureOffset(50, 16).addBox(-5.6448F, -10.5F, -1.8656F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head_r3.setTextureOffset(50, 16).addBox(4.6251F, -10.5F, -2.1376F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(-3.9764F, 0.25F, -2.5186F);
		Head.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, -0.4363F, 0.0F);
		Head_r4.setTextureOffset(50, 16).addBox(-0.5F, -10.5F, -1.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(0.5318F, 0.0F, -0.013F);
		Head.addChild(Head_r5);
		setRotationAngle(Head_r5, -3.1416F, -0.7854F, 3.1416F);
		Head_r5.setTextureOffset(50, 18).addBox(-0.6147F, -10.5F, -5.8641F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(4.2437F, 0.0F, -3.8871F);
		Head.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.0F, -0.7854F, 0.0F);
		Head_r6.setTextureOffset(50, 18).addBox(-0.5F, -10.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(0.5318F, 0.0F, -0.013F);
		Head.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.0F, -0.829F, 0.0F);
		Head_r7.setTextureOffset(50, 18).addBox(-5.8359F, -10.5F, -0.098F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(-3.315F, 0.0F, 4.0572F);
		Head.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0F, 0.7418F, 0.0F);
		Head_r8.setTextureOffset(50, 18).addBox(-0.25F, -10.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(0.5318F, 0.0F, -0.013F);
		Head.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.0F, -1.5272F, 0.0F);
		Head_r9.setTextureOffset(50, 18).addBox(4.8992F, -10.5F, -0.2666F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(6.1858F, 0.0F, -0.0263F);
		Head.addChild(Head_r10);
		setRotationAngle(Head_r10, 0.0F, 0.0436F, 0.0F);
		Head_r10.setTextureOffset(50, 18).addBox(-0.75F, -10.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(0.5318F, 0.0F, -0.013F);
		Head.addChild(Head_r11);
		setRotationAngle(Head_r11, -3.1416F, -1.5272F, 3.1416F);
		Head_r11.setTextureOffset(50, 18).addBox(-5.9156F, -10.5F, -0.2659F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(-5.1386F, 0.0F, -0.0263F);
		Head.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.0F, -0.0436F, 0.0F);
		Head_r12.setTextureOffset(50, 18).addBox(-0.25F, -10.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(5.0236F, 0.25F, 2.4814F);
		Head.addChild(Head_r13);
		setRotationAngle(Head_r13, 0.0F, -0.4363F, 0.0F);
		Head_r13.setTextureOffset(50, 16).addBox(-0.5F, -10.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(0.5318F, -0.25F, -0.013F);
		Head.addChild(Head_r14);
		setRotationAngle(Head_r14, 0.0F, -1.1345F, 0.0F);
		Head_r14.setTextureOffset(50, 16).addBox(-5.64F, -10.5F, -2.1446F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(-3.9764F, -0.25F, 2.4814F);
		Head.addChild(Head_r15);
		setRotationAngle(Head_r15, 0.0F, 0.4363F, 0.0F);
		Head_r15.setTextureOffset(50, 16).addBox(-0.5F, -10.5F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, -0.25F, 0.0F);
		Head.addChild(Head2);
		

		ModelRenderer Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(2.8427F, -0.275F, 5.1591F);
		Head2.addChild(Head_r16);
		setRotationAngle(Head_r16, 0.0F, -1.1345F, 0.0F);
		Head_r16.setTextureOffset(50, 21).addBox(-0.7F, -10.45F, -1.45F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(5.5259F, -0.275F, -2.7705F);
		Head2.addChild(Head_r17);
		setRotationAngle(Head_r17, 0.0F, 0.4363F, 0.0F);
		Head_r17.setTextureOffset(50, 21).addBox(-0.95F, -10.45F, -0.9F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(3.0028F, 0.325F, -5.0759F);
		Head2.addChild(Head_r18);
		setRotationAngle(Head_r18, -3.1416F, 2.0071F, 3.1416F);
		Head_r18.setTextureOffset(50, 21).addBox(-1.25F, -10.5F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r19 = new ModelRenderer(this);
		Head_r19.setRotationPoint(-4.3741F, 0.275F, -2.7705F);
		Head2.addChild(Head_r19);
		setRotationAngle(Head_r19, 0.0F, 2.7053F, 0.0F);
		Head_r19.setTextureOffset(50, 21).addBox(-1.2F, -10.45F, -2.15F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r20 = new ModelRenderer(this);
		Head_r20.setRotationPoint(-1.5003F, 0.325F, 5.2889F);
		Head2.addChild(Head_r20);
		setRotationAngle(Head_r20, -3.1416F, 2.0071F, 3.1416F);
		Head_r20.setTextureOffset(50, 21).addBox(0.25F, -10.5F, -1.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r21 = new ModelRenderer(this);
		Head_r21.setRotationPoint(5.8882F, 0.325F, 2.0709F);
		Head2.addChild(Head_r21);
		setRotationAngle(Head_r21, 0.0F, 2.7053F, 0.0F);
		Head_r21.setTextureOffset(50, 21).addBox(0.25F, -10.5F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer Head_r22 = new ModelRenderer(this);
		Head_r22.setRotationPoint(0.585F, -0.275F, -0.0143F);
		Head2.addChild(Head_r22);
		setRotationAngle(Head_r22, 0.0F, -1.1345F, 0.0F);
		Head_r22.setTextureOffset(50, 21).addBox(-5.854F, -10.45F, -1.609F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer Head_r23 = new ModelRenderer(this);
		Head_r23.setRotationPoint(-4.3741F, -0.275F, 2.7295F);
		Head2.addChild(Head_r23);
		setRotationAngle(Head_r23, 0.0F, 0.4363F, 0.0F);
		Head_r23.setTextureOffset(50, 21).addBox(-0.2F, -10.45F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(35, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(24, 16).addBox(-4.0F, -0.25F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 18).addBox(-4.0F, 0.75F, -4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(35, 59).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 0.51F, false);

		ModelRenderer Wing = new ModelRenderer(this);
		Wing.setRotationPoint(-1.0F, 0.0F, 0.5F);
		Body.addChild(Wing);
		setRotationAngle(Wing, 0.0F, 0.0F, -0.1309F);
		

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.3089F, -5.2957F, 4.5F);
		Wing.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.2217F);
		cube_r1.setTextureOffset(30, 0).addBox(0.25F, -1.0F, -0.25F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.8365F, -3.9919F, 4.5F);
		Wing.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.789F);
		cube_r2.setTextureOffset(30, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.0091F, 7.0125F, 3.5F);
		Wing.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0873F, 1.5272F);
		cube_r3.setTextureOffset(16, 4).addBox(-5.25F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-11.5975F, 12.9519F, 3.25F);
		Wing.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.3491F, 1.8326F);
		cube_r4.setTextureOffset(16, 8).addBox(-2.75F, 0.0F, -1.25F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.708F, 8.8303F, 3.25F);
		Wing.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0873F, 1.789F);
		cube_r5.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-12.6878F, 1.6992F, 4.0F);
		Wing.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.1745F, 1.789F);
		cube_r6.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-9.7676F, 10.1753F, 3.4265F);
		Wing.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0175F, 0.0303F, 1.909F);
		cube_r7.setTextureOffset(16, 10).addBox(-1.75F, -0.75F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-10.0176F, 7.9253F, 4.1765F);
		Wing.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0175F, -0.1006F, 1.8218F);
		cube_r8.setTextureOffset(16, 6).addBox(-4.25F, -0.75F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-10.0176F, 4.9253F, 3.9265F);
		Wing.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0338F, 0.048F, 1.8288F);
		cube_r9.setTextureOffset(16, 6).addBox(-4.25F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-10.5176F, 7.4253F, 4.4265F);
		Wing.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1013F, -0.205F, 1.8342F);
		cube_r10.setTextureOffset(16, 6).addBox(-4.25F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-10.5176F, 2.9253F, 4.4265F);
		Wing.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0561F, -0.0364F, 1.8287F);
		cube_r11.setTextureOffset(16, 6).addBox(-4.25F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-10.5176F, -0.0747F, 4.9265F);
		Wing.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0561F, -0.0364F, 1.8287F);
		cube_r12.setTextureOffset(16, 6).addBox(-3.25F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.6932F, -0.0239F, 4.3362F);
		Wing.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0451F, -0.0388F, 1.3116F);
		cube_r13.setTextureOffset(16, 0).addBox(0.25F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.6932F, -3.0239F, 4.8362F);
		Wing.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0451F, 0.8339F, 1.3116F);
		cube_r14.setTextureOffset(28, 14).addBox(3.25F, -2.5F, 2.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.6932F, -3.0239F, 4.8362F);
		Wing.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0451F, -0.0388F, 1.3116F);
		cube_r15.setTextureOffset(16, 0).addBox(1.25F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.6932F, -0.0239F, 4.3362F);
		Wing.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0559F, -0.0351F, 1.1808F);
		cube_r16.setTextureOffset(16, 0).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.6932F, -3.0239F, 4.8362F);
		Wing.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0559F, -0.0351F, 1.1808F);
		cube_r17.setTextureOffset(16, 0).addBox(-0.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-5.9604F, 6.4555F, 3.8644F);
		Wing.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1603F, -0.0304F, 1.0887F);
		cube_r18.setTextureOffset(16, 2).addBox(-3.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-6.4604F, 1.4555F, 4.3644F);
		Wing.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0628F, -0.0319F, 1.0936F);
		cube_r19.setTextureOffset(16, 2).addBox(-3.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-6.4604F, -1.5445F, 4.8644F);
		Wing.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0628F, -0.0319F, 1.0936F);
		cube_r20.setTextureOffset(16, 2).addBox(-2.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-5.9604F, 6.4555F, 3.8644F);
		Wing.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1493F, -0.0476F, 1.2184F);
		cube_r21.setTextureOffset(16, 6).addBox(-3.0F, -0.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-5.9604F, 3.4555F, 3.8644F);
		Wing.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0227F, 0.0456F, 1.2242F);
		cube_r22.setTextureOffset(16, 2).addBox(-3.0F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-6.4604F, 5.9555F, 4.1144F);
		Wing.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.1125F, -0.2005F, 1.2172F);
		cube_r23.setTextureOffset(16, 2).addBox(-2.0F, 0.25F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-6.4604F, 1.4555F, 4.3644F);
		Wing.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0523F, -0.0365F, 1.2244F);
		cube_r24.setTextureOffset(16, 2).addBox(-3.0F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-6.4604F, -1.5445F, 4.8644F);
		Wing.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0523F, -0.0365F, 1.2244F);
		cube_r25.setTextureOffset(16, 2).addBox(-2.5F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-10.0176F, 10.1753F, 3.4265F);
		Wing.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.1313F, -0.0681F, 1.61F);
		cube_r26.setTextureOffset(16, 8).addBox(-3.25F, -2.75F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-10.0176F, 7.9253F, 4.1765F);
		Wing.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.1313F, -0.0681F, 1.3918F);
		cube_r27.setTextureOffset(16, 8).addBox(-3.25F, -3.25F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-10.0176F, 4.9253F, 3.9265F);
		Wing.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0227F, 0.0456F, 1.3988F);
		cube_r28.setTextureOffset(16, 6).addBox(-3.25F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-10.5176F, 7.4253F, 3.9265F);
		Wing.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.068F, -0.2123F, 1.395F);
		cube_r29.setTextureOffset(16, 6).addBox(-2.0F, -3.25F, -0.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-10.5176F, 2.9253F, 4.4265F);
		Wing.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0376F, -0.0404F, 1.3988F);
		cube_r30.setTextureOffset(16, 6).addBox(-3.25F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-10.5176F, -0.0747F, 4.9265F);
		Wing.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0376F, -0.0404F, 1.3988F);
		cube_r31.setTextureOffset(16, 6).addBox(-3.25F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-10.0176F, 10.1753F, 3.4265F);
		Wing.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0876F, -0.0869F, 1.7813F);
		cube_r32.setTextureOffset(16, 8).addBox(-2.25F, -2.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-10.0176F, 7.9253F, 3.9265F);
		Wing.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0876F, -0.0869F, 1.5632F);
		cube_r33.setTextureOffset(16, 8).addBox(-3.25F, -2.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-10.0176F, 4.9253F, 3.9265F);
		Wing.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0436F, 1.5708F);
		cube_r34.setTextureOffset(16, 6).addBox(-3.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-10.5176F, 7.4253F, 4.4265F);
		Wing.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, -0.2182F, 1.5708F);
		cube_r35.setTextureOffset(16, 6).addBox(-3.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-10.5176F, 2.9253F, 4.4265F);
		Wing.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, -0.0436F, 1.5708F);
		cube_r36.setTextureOffset(16, 6).addBox(-3.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-10.5176F, -0.0747F, 4.9265F);
		Wing.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, -0.0436F, 1.5708F);
		cube_r37.setTextureOffset(16, 6).addBox(-3.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-10.4415F, 9.7926F, 3.4265F);
		Wing.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.0182F, -0.0132F, 1.9513F);
		cube_r38.setTextureOffset(16, 6).addBox(-2.0F, -0.3F, -0.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-10.9415F, 7.5426F, 3.6765F);
		Wing.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.0182F, -0.1005F, 1.9513F);
		cube_r39.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-10.9415F, 4.5426F, 3.9265F);
		Wing.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.05F, 0.0534F, 1.9578F);
		cube_r40.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-11.4415F, 7.7926F, 3.9265F);
		Wing.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.1497F, -0.1889F, 1.9646F);
		cube_r41.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-11.4415F, 2.5426F, 4.4265F);
		Wing.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.083F, -0.0274F, 1.9574F);
		cube_r42.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-11.4415F, -0.4574F, 4.9265F);
		Wing.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.083F, -0.0274F, 1.9574F);
		cube_r43.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-11.9307F, -1.8613F, 4.5F);
		Wing.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0873F, 2.1817F);
		cube_r44.setTextureOffset(16, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wing.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, 1.0472F);
		cube_r45.setTextureOffset(16, 12).addBox(-6.0F, 1.0F, 3.75F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer Wing2 = new ModelRenderer(this);
		Wing2.setRotationPoint(1.0F, 0.0F, 0.5F);
		Body.addChild(Wing2);
		setRotationAngle(Wing2, 0.0F, 0.0F, 0.1309F);
		

		ModelRenderer cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(8.3089F, -5.2957F, 4.5F);
		Wing2.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -1.2217F);
		cube_r46.setTextureOffset(30, 0).addBox(-2.25F, -1.0F, -0.25F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(5.8365F, -3.9919F, 4.5F);
		Wing2.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -1.789F);
		cube_r47.setTextureOffset(30, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(14.0091F, 7.0125F, 3.5F);
		Wing2.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, -0.0873F, -1.5272F);
		cube_r48.setTextureOffset(16, 4).addBox(-0.75F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(11.5975F, 12.9519F, 3.25F);
		Wing2.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, -0.3491F, -1.8326F);
		cube_r49.setTextureOffset(16, 8).addBox(-4.25F, 0.0F, -1.25F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(11.708F, 8.8303F, 3.25F);
		Wing2.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, -0.0873F, -1.789F);
		cube_r50.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(12.6878F, 1.6992F, 4.0F);
		Wing2.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, -0.1745F, -1.789F);
		cube_r51.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(9.7676F, 10.1753F, 3.4265F);
		Wing2.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0175F, -0.0303F, -1.909F);
		cube_r52.setTextureOffset(16, 10).addBox(-6.25F, -0.75F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(10.0176F, 7.9253F, 4.1765F);
		Wing2.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0175F, 0.1006F, -1.8218F);
		cube_r53.setTextureOffset(16, 6).addBox(-2.75F, -0.75F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(10.0176F, 4.9253F, 3.9265F);
		Wing2.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.0338F, -0.048F, -1.8288F);
		cube_r54.setTextureOffset(16, 6).addBox(-0.75F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(10.5176F, 7.4253F, 4.4265F);
		Wing2.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.1013F, 0.205F, -1.8342F);
		cube_r55.setTextureOffset(16, 6).addBox(-0.75F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(10.5176F, 2.9253F, 4.4265F);
		Wing2.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.0561F, 0.0364F, -1.8287F);
		cube_r56.setTextureOffset(16, 6).addBox(-0.75F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(10.5176F, -0.0747F, 4.9265F);
		Wing2.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.0561F, 0.0364F, -1.8287F);
		cube_r57.setTextureOffset(16, 6).addBox(-1.75F, -0.75F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(4.6932F, -0.0239F, 4.3362F);
		Wing2.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0451F, 0.0388F, -1.3116F);
		cube_r58.setTextureOffset(16, 0).addBox(-3.25F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(4.6932F, -3.0239F, 4.8362F);
		Wing2.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0451F, -0.8339F, -1.3116F);
		cube_r59.setTextureOffset(28, 14).addBox(-6.25F, -2.5F, 2.25F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(4.6932F, -3.0239F, 4.8362F);
		Wing2.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0451F, 0.0388F, -1.3116F);
		cube_r60.setTextureOffset(16, 0).addBox(-4.25F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(4.6932F, -0.0239F, 4.3362F);
		Wing2.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0559F, 0.0351F, -1.1808F);
		cube_r61.setTextureOffset(16, 0).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(4.6932F, -3.0239F, 4.8362F);
		Wing2.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0559F, 0.0351F, -1.1808F);
		cube_r62.setTextureOffset(16, 0).addBox(-2.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(5.9604F, 6.4555F, 3.8644F);
		Wing2.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.1603F, 0.0304F, -1.0887F);
		cube_r63.setTextureOffset(16, 2).addBox(-0.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(6.4604F, 1.4555F, 4.3644F);
		Wing2.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0628F, 0.0319F, -1.0936F);
		cube_r64.setTextureOffset(16, 2).addBox(-0.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(6.4604F, -1.5445F, 4.8644F);
		Wing2.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0628F, 0.0319F, -1.0936F);
		cube_r65.setTextureOffset(16, 2).addBox(-1.5F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(5.9604F, 6.4555F, 3.8644F);
		Wing2.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.1493F, 0.0476F, -1.2184F);
		cube_r66.setTextureOffset(16, 6).addBox(-2.0F, -0.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(5.9604F, 3.4555F, 3.8644F);
		Wing2.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0227F, -0.0456F, -1.2242F);
		cube_r67.setTextureOffset(16, 2).addBox(-1.0F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(6.4604F, 5.9555F, 4.1144F);
		Wing2.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.1125F, 0.2005F, -1.2172F);
		cube_r68.setTextureOffset(16, 2).addBox(-2.0F, 0.25F, -0.75F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(6.4604F, 1.4555F, 4.3644F);
		Wing2.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0523F, 0.0365F, -1.2244F);
		cube_r69.setTextureOffset(16, 2).addBox(-1.0F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(6.4604F, -1.5445F, 4.8644F);
		Wing2.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0523F, 0.0365F, -1.2244F);
		cube_r70.setTextureOffset(16, 2).addBox(-1.5F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(10.0176F, 10.1753F, 3.4265F);
		Wing2.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.1313F, 0.0681F, -1.61F);
		cube_r71.setTextureOffset(16, 8).addBox(-3.75F, -2.75F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(10.0176F, 7.9253F, 4.1765F);
		Wing2.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.1313F, 0.0681F, -1.3918F);
		cube_r72.setTextureOffset(16, 8).addBox(-3.75F, -3.25F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(10.0176F, 4.9253F, 3.9265F);
		Wing2.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0227F, -0.0456F, -1.3988F);
		cube_r73.setTextureOffset(16, 6).addBox(-1.75F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(10.5176F, 7.4253F, 3.9265F);
		Wing2.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.068F, 0.2123F, -1.395F);
		cube_r74.setTextureOffset(16, 6).addBox(-3.0F, -3.25F, -0.25F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(10.5176F, 2.9253F, 4.4265F);
		Wing2.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0376F, 0.0404F, -1.3988F);
		cube_r75.setTextureOffset(16, 6).addBox(-1.75F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(10.5176F, -0.0747F, 4.9265F);
		Wing2.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0376F, 0.0404F, -1.3988F);
		cube_r76.setTextureOffset(16, 6).addBox(-1.75F, -3.25F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(10.0176F, 10.1753F, 3.4265F);
		Wing2.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0876F, 0.0869F, -1.7813F);
		cube_r77.setTextureOffset(16, 8).addBox(-4.75F, -2.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(10.0176F, 7.9253F, 3.9265F);
		Wing2.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0876F, 0.0869F, -1.5632F);
		cube_r78.setTextureOffset(16, 8).addBox(-3.75F, -2.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(10.0176F, 4.9253F, 3.9265F);
		Wing2.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, -0.0436F, -1.5708F);
		cube_r79.setTextureOffset(16, 6).addBox(-1.75F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(10.5176F, 7.4253F, 4.4265F);
		Wing2.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.2182F, -1.5708F);
		cube_r80.setTextureOffset(16, 6).addBox(-1.75F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(10.5176F, 2.9253F, 4.4265F);
		Wing2.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0436F, -1.5708F);
		cube_r81.setTextureOffset(16, 6).addBox(-1.75F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(10.5176F, -0.0747F, 4.9265F);
		Wing2.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0436F, -1.5708F);
		cube_r82.setTextureOffset(16, 6).addBox(-1.75F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(10.4415F, 9.7926F, 3.4265F);
		Wing2.addChild(cube_r83);
		setRotationAngle(cube_r83, -0.0182F, 0.0132F, -1.9513F);
		cube_r83.setTextureOffset(16, 6).addBox(-3.0F, -0.3F, -0.25F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(10.9415F, 7.5426F, 3.6765F);
		Wing2.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.0182F, 0.1005F, -1.9513F);
		cube_r84.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(10.9415F, 4.5426F, 3.9265F);
		Wing2.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.05F, -0.0534F, -1.9578F);
		cube_r85.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(11.4415F, 7.7926F, 3.9265F);
		Wing2.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.1497F, 0.1889F, -1.9646F);
		cube_r86.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(11.4415F, 2.5426F, 4.4265F);
		Wing2.addChild(cube_r87);
		setRotationAngle(cube_r87, -0.083F, 0.0274F, -1.9574F);
		cube_r87.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(11.4415F, -0.4574F, 4.9265F);
		Wing2.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.083F, 0.0274F, -1.9574F);
		cube_r88.setTextureOffset(16, 6).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(11.9307F, -1.8613F, 4.5F);
		Wing2.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, -0.0873F, -2.1817F);
		cube_r89.setTextureOffset(16, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wing2.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -1.0472F);
		cube_r90.setTextureOffset(16, 12).addBox(0.0F, 1.0F, 3.75F, 6.0F, 1.0F, 1.0F, 0.0F, true);

        RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 32).addBox(-2.735F, -1.42F, -1.41F, 3.0F, 8.0F, 3.0F, 1.0F, false);
		RightArm.setTextureOffset(43, 0).addBox(-3.5F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		ModelRenderer cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-0.6308F, -3.9832F, -0.5F);
		RightArm.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.829F, 1.0472F);
		cube_r91.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-3.6308F, -3.4832F, -0.5F);
		RightArm.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.829F, 0.2618F);
		cube_r92.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-4.6308F, -3.2332F, -0.5F);
		RightArm.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.829F, 0.0873F);
		cube_r93.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-4.8808F, -0.7332F, -0.5F);
		RightArm.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.829F, -0.6981F);
		cube_r94.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(-5.1308F, -2.2332F, -0.5F);
		RightArm.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.829F, -0.3054F);
		cube_r95.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(0, 32).addBox(-0.265F, -1.42F, -1.41F, 3.0F, 8.0F, 3.0F, 1.0F, true);
		LeftArm.setTextureOffset(43, 0).addBox(-0.5F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		ModelRenderer cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.6308F, -3.9832F, -0.5F);
		LeftArm.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, -0.829F, -1.0472F);
		cube_r96.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(3.6308F, -3.4832F, -0.5F);
		LeftArm.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, -0.829F, -0.2618F);
		cube_r97.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(4.6308F, -3.2332F, -0.5F);
		LeftArm.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, -0.829F, -0.0873F);
		cube_r98.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(5.1308F, -2.2332F, -0.5F);
		LeftArm.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, -0.829F, 0.3054F);
		cube_r99.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(4.8808F, -0.7332F, -0.5F);
		LeftArm.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, -0.829F, 0.6981F);
		cube_r100.setTextureOffset(12, 16).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.setTextureOffset(0, 59).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		ModelRenderer RightKneeWing = new ModelRenderer(this);
		RightKneeWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(RightKneeWing);
		

		ModelRenderer cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-4.0F, 3.25F, 0.0F);
		RightKneeWing.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.3927F, -0.2618F, 0.0F);
		cube_r101.setTextureOffset(32, 9).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);

		ModelRenderer cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-4.0F, 3.0F, 0.25F);
		RightKneeWing.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.1309F, -0.2618F, 0.0F);
		cube_r102.setTextureOffset(34, 5).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-3.25F, 4.0F, -1.5F);
		RightKneeWing.addChild(cube_r103);
		setRotationAngle(cube_r103, -1.0472F, -0.2618F, 0.0F);
		cube_r103.setTextureOffset(36, 2).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-3.75F, 4.0F, -0.75F);
		RightKneeWing.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.6981F, -0.2618F, 0.0F);
		cube_r104.setTextureOffset(36, 2).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		ModelRenderer cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-4.0F, 3.75F, -0.5F);
		RightKneeWing.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.2618F, -0.2618F, 0.0F);
		cube_r105.setTextureOffset(34, 5).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		ModelRenderer cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-3.0F, 5.0F, -2.0F);
		RightKneeWing.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.6545F, -0.5236F, 0.0F);
		cube_r106.setTextureOffset(42, 16).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.setTextureOffset(0, 59).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		ModelRenderer LeftKneeWing = new ModelRenderer(this);
		LeftKneeWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftKneeWing);
		

		ModelRenderer cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(4.0F, 3.25F, 0.0F);
		LeftKneeWing.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.3927F, 0.2618F, 0.0F);
		cube_r107.setTextureOffset(32, 9).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(4.0F, 3.0F, 0.25F);
		LeftKneeWing.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.1309F, 0.2618F, 0.0F);
		cube_r108.setTextureOffset(34, 5).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(3.25F, 4.0F, -1.5F);
		LeftKneeWing.addChild(cube_r109);
		setRotationAngle(cube_r109, -1.0472F, 0.2618F, 0.0F);
		cube_r109.setTextureOffset(36, 2).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(3.75F, 4.0F, -0.75F);
		LeftKneeWing.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.6981F, 0.2618F, 0.0F);
		cube_r110.setTextureOffset(36, 2).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(4.0F, 3.75F, -0.5F);
		LeftKneeWing.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.2618F, 0.2618F, 0.0F);
		cube_r111.setTextureOffset(34, 5).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(3.0F, 5.0F, -2.0F);
		LeftKneeWing.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.6545F, 0.5236F, 0.0F);
		cube_r112.setTextureOffset(42, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belt.setTextureOffset(59, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, 0.51F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(19, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		ModelRenderer Sandal2 = new ModelRenderer(this);
		Sandal2.setRotationPoint(-0.25F, -0.5F, 0.0F);
		RightBoot.addChild(Sandal2);
		Sandal2.setTextureOffset(0, 20).addBox(-2.0F, 12.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		Sandal2.setTextureOffset(10, 16).addBox(-0.5F, 11.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Sandal2.setTextureOffset(0, 16).addBox(-2.0F, 12.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		Sandal2.setTextureOffset(0, 16).addBox(-2.0F, 12.5F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(19, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		ModelRenderer Sandal = new ModelRenderer(this);
		Sandal.setRotationPoint(0.25F, -0.5F, 0.0F);
		LeftBoot.addChild(Sandal);
		Sandal.setTextureOffset(0, 20).addBox(-2.0F, 12.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		Sandal.setTextureOffset(10, 16).addBox(-0.5F, 11.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Sandal.setTextureOffset(0, 16).addBox(-2.0F, 12.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Sandal.setTextureOffset(0, 16).addBox(-2.0F, 12.5F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

    }

}